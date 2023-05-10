package com.example.a4th_year_android_timetable_app;

public class Posts {

    //Variables

    //Irish Variables
    private final String irish_language;
    private final String irish_name;
    private final String irish_stop_name;
    private final String irish_arrival_time;
    private final String irish_departure_time;

    //Irish Sub Variables
    private final String irish_second_stop_name;
    private final String irish_second_arrival_time;
    private final String irish_second_departure_time;

    //English Variables
    private final String english_language;
    private final String name;
    private final String arrival_time;
    private final String departure_time;
    private final String stop_name;

    //English Sub Variables
    private final String second_stop_name;
    private final String second_arrival_time;
    private final String second_departure_time;

    //Constructor

    public Posts(String irish_stop_name, String irish_language, String irish_name, String irish_arrival_time, String irish_departure_time,
                 String irish_second_stop_name,String irish_second_arrival_time, String irish_second_departure_time,
                 String english_language,String name, String arrival_time, String departure_time, String stop_name,
                 String second_stop_name, String second_arrival_time, String second_departure_time) {

        this.irish_language = irish_language;
        this.irish_name = irish_name;
        this.irish_stop_name = irish_stop_name;
        this.irish_arrival_time = irish_arrival_time;
        this.irish_departure_time = irish_departure_time;

        this.irish_second_stop_name = irish_second_stop_name;
        this.irish_second_arrival_time = irish_second_arrival_time;
        this.irish_second_departure_time = irish_second_departure_time;

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


    public String getIrish_language() {
        return irish_language;
    }

    public String getIrish_name() {
        return irish_name;
    }

    public String getIrish_stop_name(){
        return irish_stop_name;
    }


    public String getIrish_arrival_time() {
        return irish_arrival_time;
    }

    public String getIrish_departure_time() {
        return irish_departure_time;
    }

    public String getIrish_second_stop_name() {
        return irish_second_stop_name;
    }

    public String getIrish_second_arrival_time() {
        return irish_second_arrival_time;
    }

    public String getIrish_second_departure_time() {
        return irish_second_departure_time;
    }

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
