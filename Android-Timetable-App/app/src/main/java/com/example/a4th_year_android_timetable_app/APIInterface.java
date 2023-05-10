package com.example.a4th_year_android_timetable_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("v1/62e67462-24c3-454c-b026-80d79247ef7c")
    //@GET("/posts")
    Call<List<Posts>> getPosts();
}
