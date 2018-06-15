package org.sinabro.android_dagger2_example.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 윤정현 on 2018-02-06.
 */

public class NetworkClient {

    static String baseURL = "";


    public static Api getClient() {
        return new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(Api.class);
    }
}
