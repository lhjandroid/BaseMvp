package com.lhj.mvpbase.util;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jingyou on 2016/6/27.
 * Retrofit管理类
 */
public class RetrofitManager {

//    //地址
//    public static final String BASE_PHONENUMINFO_URL = "http://120.24.48.199:8090/";
//
//    //短缓存有效期为1分钟
//    public static final int CACHE_STALE_SHORT = 60;
//    //长缓存有效期为7天
//    public static final int CACHE_STALE_LONG = 60 * 60 * 24 * 7;
//
//    public static final String CACHE_CONTROL_AGE = "Cache-Control: public, max-age=";
//
//    //查询缓存的Cache-Control设置，为if-only-cache时只查询缓存而不会请求服务器，max-stale可以配合设置缓存失效时间
//    public static final String CACHE_CONTROL_CACHE = "only-if-cached, max-stale=" + CACHE_STALE_LONG;
//    //查询网络的Cache-Control设置，头部Cache-Control设为max-age=0时则不会使用缓存而请求服务器
//    public static final String CACHE_CONTROL_NETWORK = "max-age=0";
//    private static OkHttpClient mOkHttpClient;
//    //private final PhoneNunInfoService phoneNunInfoService;
//    private final LoginApi loginApi;
//
//    public static RetrofitManager builder() {
//        return new RetrofitManager();
//    }
//
////    public PhoneNunInfoService getService() {
////        return phoneNunInfoService;
////    }
//
//
//    public LoginApi getLoginApi() {
//        return loginApi;
//    }
//
//    private RetrofitManager() {
//        initOkHttpClient();
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(BASE_PHONENUMINFO_URL)
//                .client(mOkHttpClient)
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        //phoneNunInfoService = retrofit.create(PhoneNunInfoService.class);
//        loginApi = retrofit.create(LoginApi.class);
//    }
//
//    private void initOkHttpClient() {
//        //HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        //interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        if (mOkHttpClient == null) {
//            synchronized (RetrofitManager.class) {
//                if (mOkHttpClient == null) {
//
//                    // 指定缓存路径,缓存大小100Mb
////                    Cache cache = new Cache(new File(MyApplication.getContext().getCacheDir(), "HttpCache"),
////                            1024 * 1024 * 100);
//
//                    mOkHttpClient = new OkHttpClient.Builder()
//                            //.cache(cache)
//                            //.addInterceptor(mRewriteCacheControlInterceptor)
//                            //.addNetworkInterceptor(mRewriteCacheControlInterceptor)
//                            //.addInterceptor(interceptor)
//                            //.addNetworkInterceptor(new StethoInterceptor())
//                            .retryOnConnectionFailure(true)
//                            .connectTimeout(15, TimeUnit.SECONDS)
//                            .build();
//                }
//            }
//        }
//    }

    // 云端响应头拦截器，用来配置缓存策略
//    private Interceptor mRewriteCacheControlInterceptor = new Interceptor() {
//        @Override
//        public Response intercept(Chain chain) throws IOException {
//            Request request = chain.request();
//            if (!NetUtil.isNetworkConnected()) {
//                request = request.newBuilder().cacheControl(CacheControl.FORCE_CACHE).build();
//            }
//            Response originalResponse = chain.proceed(request);
//            if (NetUtil.isNetworkConnected()) {
//                //有网的时候读接口上的@Headers里的配置，你可以在这里进行统一的设置
//                String cacheControl = request.cacheControl().toString();
//                return originalResponse.newBuilder().header("Cache-Control", cacheControl)
//                        .removeHeader("Pragma").build();
//            } else {
//                return originalResponse.newBuilder()
//                        .header("Cache-Control", "public, only-if-cached, max-stale=" + CACHE_STALE_LONG)
//                        .removeHeader("Pragma").build();
//            }
//        }
//    };
}
