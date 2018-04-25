package com.example.vladislav.vkclient.helper;

import android.app.Application;

import com.example.vladislav.vkclient.BuildConfig;
import com.example.vladislav.vkclient.Interfaces.Vk;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vk.sdk.VKSdk;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {
    static Vk vk;
    public static String ACCESS_TOKEN = "e5c4c79050065d9826723d1ccf98214a72841a661363c43c405f6cfd36ff224bfe9e441ce51bf1d11dd6e";

    @Override
    public void onCreate() {
        super.onCreate();
        OkHttpClient.Builder clientBld = new OkHttpClient.Builder();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        clientBld.addInterceptor(interceptor);
        OkHttpClient client = clientBld
                .build();
        Gson gson = new GsonBuilder()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        VKSdk.initialize(this);
        vk = retrofit.create(Vk.class);
        }
    public static Vk getVk() {
        return vk;
    }
}