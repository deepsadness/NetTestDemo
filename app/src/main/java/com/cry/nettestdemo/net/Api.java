package com.cry.nettestdemo.net;

import com.cry.nettestdemo.bean.response.LoginResponseModel;

import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.POST;
import rx.Observable;

/**
 * DESCRIPTION:
 * Author: Cry
 * DATE: 16/9/28 下午10:48
 */

public interface Api {
    @POST("/login")
    @Headers("X-HB-Client-Type:ayb-android")
    Observable<LoginResponseModel> login(@Body String jsonAccount);
}
