package com.example.davidburnett.runninglab;

import java.util.ArrayList;

/**
 * Created by davidburnett on 12/09/2017.
 */

public class Competition {

    ArrayList<Athlete>competitors = new ArrayList<>();

    public Competition(){
        this.competitors = new ArrayList<>();
    }

    public ArrayList<Athlete> getCompetitors() {
        return competitors;
    }

    public void addAthleteToCompetitors(Athlete athlete){
        competitors.add(athlete);
    }

    public Athlete getLongestDistanceWinner(){
        int longestDistance = Integer.MIN_VALUE;
        Athlete winner = null;

        for (Athlete athlete : competitors) {
            for (Activity activity : athlete.getActivities()){
                int currentDistance = activity.getDistance();
                if (currentDistance > longestDistance) {
                    longestDistance = currentDistance;
                    winner = athlete;
                }
            }
        }
        return winner;
    }

    public ArrayList<Athlete> findAthleteByDistance(this.c, int distance){
        competitors = new ArrayList<>();

        for (Athlete athlete : competitors){
            for (Activity activity : athlete.getActivities()){
                int activityDistance = activity.getDistance();
                if (distance == activityDistance) {
                    competitors.add(athlete);
                }
            }

        }
        return competitors;
    }

    public  Athlete findFastestTime(ArrayList<Athlete>competitors, int distance){
        competitors.
    }
}
