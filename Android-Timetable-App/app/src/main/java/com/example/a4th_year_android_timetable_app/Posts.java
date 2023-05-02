package com.example.a4th_year_android_timetable_app;

public class Posts {
    private final String title;
    private final String body;

    public Posts(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
