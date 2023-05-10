package com.example.a4th_year_android_timetable_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("v1/b278285a-8062-4d03-a7dc-a180f76b5c9c")
    //@GET("/posts")
    Call<List<Posts>> getPosts();
}
