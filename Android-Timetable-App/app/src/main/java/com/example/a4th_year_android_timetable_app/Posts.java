package com.example.a4th_year_android_timetable_app;

public class Posts {

    //Variables

    private final String english_language;
    private final String name;
    private final String arrival_time;
    private final String departure_time;
    private final String stop_name;

    private final String second_stop_name;
    private final String second_arrival_time;
    private final String second_departure_time;

    //Constructor

    public Posts(String english_language,String name, String arrival_time, String departure_time, String stop_name,
                 String second_stop_name, String second_arrival_time, String second_departure_time) {
        this.english_language = english_language;
        this.name = name;
        this.arrival_time = arrival_time;
        this.departure_time = departure_time;
        this.stop_name = stop_name;
        this.second_stop_name = second_stop_name;
        this.second_arrival_time = second_arrival_time;
        this.second_departure_time = second_departure_time;
    }

    //Getters

    public String getEnglish_language() {
        return english_language;
    }

    public String getName() {
        return name;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public String getStop_name() {
        return stop_name;
    }

    public String getSecond_stop_name() {
        return second_stop_name;
    }

    public String getSecond_arrival_time() {
        return second_arrival_time;
    }

    public String getSecond_departure_time() {
        return second_departure_time;
    }

    //
    // SPACE
    //

    //    @SerializedName("route_short_name")
//    @Expose
//    private final String routeShortName;
//    @SerializedName("route_long_name")
//    @Expose
//    private final String routeLongName;
//
//    public Posts(String routeShortName, String routeLongName) {
//        this.routeShortName = routeShortName;
//        this.routeLongName = routeLongName;
//    }
//
//    public String getRouteShortName() {
//        return routeShortName;
//    }
//
//    public String getRouteLongName() {
//        return routeLongName;
//    }
}
