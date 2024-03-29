package com.olq.framework.http.retrofit.builder;


import com.olq.framework.utils.L;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


/**
 * Created by Administrator on 2016/4/27.
 */
public class LoggingInterceptor implements Interceptor {


    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
//        L.log("url : ", request.url() + "");
        Response response = chain.proceed(request);
        L.log("数据：",response.body().string());
        return response;
    }
}
