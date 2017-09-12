package com.example.davidburnett.runninglab;

import java.util.ArrayList;

/**
 * Created by davidburnett on 12/09/2017.
 */

public class Athlete {
    private String name;
    private ArrayList<Activity> activities = new ArrayList<>();

    public Athlete(String name){
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void addActivity(Activity activity){
        activities.add(activity);

    }


}
