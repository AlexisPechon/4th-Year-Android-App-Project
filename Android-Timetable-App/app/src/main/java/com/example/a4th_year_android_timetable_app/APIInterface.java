package com.example.a4th_year_android_timetable_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("v1/d792c901-83c0-4eeb-b725-a77819cb1fc8")
    //@GET("/posts")
    Call<List<Posts>> getPosts();
}
