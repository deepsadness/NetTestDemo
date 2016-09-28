package com.cry.nettestdemo.net;

import com.cry.nettestdemo.bean.response.LoginResponseModel;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;

/**
 * DESCRIPTION:
 * Author: Cry
 * DATE: 16/9/28 下午11:26
 */

public class RetrofitManager {
    private static RetrofitManager sRetrofitManager;

    private RetrofitManager() {
    }

    public static RetrofitManager getRetrofitManager() {
        if (sRetrofitManager == null) {
            sRetrofitManager = new RetrofitManager();
        }
        return sRetrofitManager;
    }

    public Observable<LoginResponseModel> login(String jsonAccount) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.baobaobooks.net/account/v1")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        return api.login(jsonAccount);
    }
}
