package com.example.a4th_year_android_timetable_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/*
 * Author: Alexis Pechon
 * Student ID: x19358953
 * Date: 13/05/2023
 * File: APIInterface.java
*/


public interface APIInterface {
    @GET("v1/d4c0aabd-b03e-4086-9cae-3561a5f6c564") //Getting the information from the API
    //@GET("/posts")
    Call<List<Posts>> getPosts();
}
