package com.example.a4th_year_android_timetable_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("v1/f26de8ad-181d-403f-850b-9e49fe578035")
    //@GET("/posts")
    Call<List<Posts>> getPosts();
}
