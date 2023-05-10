package com.example.a4th_year_android_timetable_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("v1/d01eb520-0fb0-4f1a-9dca-280019c0d2da")
    //@GET("/posts")
    Call<List<Posts>> getPosts();
}
