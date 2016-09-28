package com.cry.nettestdemo.net.interceptor;

import android.support.annotation.VisibleForTesting;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * DESCRIPTION:
 * Author: Cry
 * DATE: 16/9/29 上午12:00
 */

public class LoginInterceptor implements Interceptor {
    private final String mBasicAuthId;
    private final String mBasicAuthPass;

    private volatile String mToken;                             // 1
    private volatile String mMacKey;

    public LoginInterceptor(String basicAuthId,                // 2
                             String basicAuthPass) {
        mBasicAuthId = basicAuthId;
        mBasicAuthPass = basicAuthPass;
    }

    public void setAuth(String token, String macKey) {          // 3
        mToken = token;
        mMacKey = macKey;
    }
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        return chain.proceed(request);
    }

    @VisibleForTesting
    void tokenAuth(Request.Builder newRequest, HttpUrl url,
                   long timestamp) {                                   // 4
        // ...
    }

    @VisibleForTesting
    void basicAuth(Request.Builder newRequest, HttpUrl url,
                   long timestamp) {
        // ...
    }
}
