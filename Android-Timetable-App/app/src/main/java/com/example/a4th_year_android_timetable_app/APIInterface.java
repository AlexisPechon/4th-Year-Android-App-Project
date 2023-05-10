package com.example.a4th_year_android_timetable_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("v1/41a8a884-6d0e-4077-9f6f-38655f2dc31e")
    //@GET("/posts")
    Call<List<Posts>> getPosts();
}
