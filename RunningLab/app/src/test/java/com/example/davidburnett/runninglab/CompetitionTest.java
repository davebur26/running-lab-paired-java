package com.example.davidburnett.runninglab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 12/09/2017.
 */
public class CompetitionTest {

    Athlete athlete1;
    Athlete athlete2;
    Competition competition;
    Run run1;
    Run run2;
    Run run3;


    @Before
    public void before(){
        athlete1 = new Athlete("Dave");
        run1 = new Run(20.00, 10, 500);
        run2 = new Run(22.00, 25, 500);
        athlete1.addActivity(run1);
        athlete1.addActivity(run2);
        athlete2 = new Athlete("Alice");
        run3 = new Run(45.00, 15, 100);
        athlete2.addActivity(run3);
        competition = new Competition();
    }

    @Test
    public void addAthleteToCompetition(){
        competition.addAthleteToCompetitors(athlete1);
        assertEquals(1, competition.getCompetitors().size());
        competition.addAthleteToCompetitors(athlete2);
        assertEquals(2, competition.getCompetitors().size());
    }

    @Test
    public void testCompetiton(){
        competition.addAthleteToCompetitors(athlete1);
        competition.addAthleteToCompetitors(athlete2);
        assertEquals(athlete1, competition.getLongestDistanceWinner());
    }
}