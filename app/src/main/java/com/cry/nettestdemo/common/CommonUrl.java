package com.cry.nettestdemo.common;

/**
 * DESCRIPTION:
 * Author: Cry
 * DATE: 16/9/28 下午11:29
 */

public interface CommonUrl {
    //mobile client header
    String FROM_ANDROID = "ayb-android";

    String BASE_URL_PREFIX="https://api.baobaobooks";
    String TEST_SUFFIX=".net";
    String REAL_SUFFIX=".com";
    //账户
    String ACCOUNT ="account";


    //VERSION
    String ACCOUNT_VERSION = "v1";
    String AYB_VERSION = "v2";
    String SMS_VERSION = "v1";

    // 账户体系相关
    String BASE_URL_ACCOUNT = BASE_URL_PREFIX + TEST_SUFFIX + "/" + ACCOUNT+"/"+ACCOUNT_VERSION;
    String LOGIN="/login";

    public static final String URL_ABOUT_US = "http://zl.baobaobooks." + TEST_SUFFIX + "/ayb/about?v=";
    public static final String URL_BOOK_SUIT_PREFIX = "http://zl.baobaobooks" + TEST_SUFFIX + "/ayb/qrcode?channel_id=";
    public static final String URL_BOOK_SUIT_PREFIX2 = "http://zl.baobaobooks" + TEST_SUFFIX + "/ayb/channel/";

    public static final String URL_OFFICIAL_WEBSITE = "http://www.baobaobooks.com/";
    public static final String URL_PREVIEW_COURSE = "ayb://hb/course/preview?course_id=";
    public static final String URL_USER_PROTOCOL = "http://zl.baobaobooks.com/ayb/protocol";


    //请求头相关
    String HEADER_AUTHORIZATION = "Authorization";
    String HEADER_HBAPI = "HBAPI";
    String HEADER_X_HB_Client_Type = "X-HB-Client-Type";

    // 各大模块头

    String AYB = "ayb";
    String SMS = "sms";
}
