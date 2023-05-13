package com.example.a4th_year_android_timetable_app;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/*
 * Author: Alexis Pechon
 * Student ID: x19358953
 * Date: 13/05/2023
 * File: MainActivity.java
 */

public class MainActivity extends AppCompatActivity {

    //The purpose of the MainActivity is to structure the way the main application
    //would look when the app is launched.
    //The following code shows how the information is structured and presented
    //inside of the app.

    //Variables
    RecyclerView recyclerView;
    ProgressBar progressBar;
    LinearLayoutManager layoutManager;
    PostsAdapter adapter;
    List<Posts> postsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        //All of the GUI elements of the application, such as the RecyclerView
        //will be generated all at once when the app is launched or executed.
        //This method will be called when the app is launched and initialises the
        //recycler views and progress bar.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new PostsAdapter(postsList);
        recyclerView.setAdapter(adapter);


        fetchPosts();

    }

    private void fetchPosts(){
        progressBar.setVisibility(View.VISIBLE);
        RetrofitClient.getRetrofitClient().getPosts().enqueue(new Callback<List<Posts>>() {
            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
                if (response.isSuccessful() && response.body() != null){
                    postsList.addAll(response.body());
                    adapter.notifyDataSetChanged();
                    progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {
                //If an error were to occur while trying to execute the app
                //or displaying the information,
                //this error method would be called to display an error message.
                progressBar.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this,
                                "Error: " + t.getMessage(),
                                Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}
