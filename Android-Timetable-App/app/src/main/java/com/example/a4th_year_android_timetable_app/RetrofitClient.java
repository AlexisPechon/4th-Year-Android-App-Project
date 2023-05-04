package com.example.a4th_year_android_timetable_app;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    //private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private static final String BASE_URL = "https://galway-bus.apis.ie/";

    //private final String GET_GALWAY_BUS_URL = "https://galway-bus.apis.ie/api/groute/404/0";

    //Retrofit instance
    private static Retrofit retrofit = null;

    public static APIInterface getRetrofitClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(APIInterface.class);
    }
}
