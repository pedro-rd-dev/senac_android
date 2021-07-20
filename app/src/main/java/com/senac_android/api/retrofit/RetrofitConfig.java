package com.senac_android.api.retrofit;

import com.senac_android.api.services.UserService;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

    private Retrofit retrofit;

    public RetrofitConfig() {
        OkHttpClient client = new OkHttpClient.Builder().build();

        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://10.4.7.4:8080/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public UserService setUserService() {
        return this.retrofit.create(UserService.class);
    }

}
