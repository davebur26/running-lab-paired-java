package com.example.davidburnett.runninglab;

/**
 * Created by davidburnett on 12/09/2017.
 */

public class Run extends Activity {

    private int altitudeGained;

    public Run(double time, int distance, int altitudeGained){
        super(time, distance);
        this.altitudeGained = altitudeGained;
    }

    public int getAltitudeGained() {
        return altitudeGained;
    }

    public void setAltitudeGained(int altitudeGained) {
        this.altitudeGained = altitudeGained;
    }
}
