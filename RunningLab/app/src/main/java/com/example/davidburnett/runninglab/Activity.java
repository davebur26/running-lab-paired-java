package com.example.davidburnett.runninglab;

/**
 * Created by davidburnett on 12/09/2017.
 */

public abstract class Activity {
    double time;
    int distance;

    public Activity(double time, int distance){
        this.time = time;
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
