package com.example.a4th_year_android_timetable_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("v1/c997f23d-c6d4-479f-a887-cf016b942c98")
    //@GET("/posts")
    Call<List<Posts>> getPosts();
}
