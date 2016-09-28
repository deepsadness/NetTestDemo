package com.cry.nettestdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.cry.nettestdemo.bean.request.LoginRequestModel;
import com.cry.nettestdemo.bean.response.LoginResponseModel;
import com.cry.nettestdemo.net.RetrofitManager;
import com.google.gson.Gson;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view){

        LoginRequestModel loginRequestModel = new LoginRequestModel();
        loginRequestModel.setAccount("fxm5547");
        loginRequestModel.setPassword("xiaoyuer");
        String jsonAccount = new Gson().toJson(loginRequestModel);
        System.out.println(jsonAccount);
        Observable<LoginResponseModel> observable = RetrofitManager.getRetrofitManager().login(jsonAccount);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<LoginResponseModel>() {
                    @Override
                    public void onCompleted() {
                        Log.i(TAG, "onCompleted: ");
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        Log.i(TAG, "onError: ");
                    }

                    @Override
                    public void onNext(LoginResponseModel loginResponseModel) {
                        Log.i(TAG, "onNext: "+loginResponseModel.toString());
                    }
                });
    }
}
