package com.cry.nettestdemo.bean.response;

/**
 * DESCRIPTION:
 * Author: Cry
 * DATE: 16/9/28 下午11:06
 */
public class LoginResponseModel {

    /**
     * user_id : 36845
     * token : 38e203a2****************
     * ttl : 7776000
     */

    private String user_id;
    private String token;
    private int ttl;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    @Override
    public String toString() {
        return "LoginResponseModel{" +
                "user_id='" + user_id + '\'' +
                ", token='" + token + '\'' +
                ", ttl=" + ttl +
                '}';
    }
}
