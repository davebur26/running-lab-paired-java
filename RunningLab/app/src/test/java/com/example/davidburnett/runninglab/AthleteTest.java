package com.example.davidburnett.runninglab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by davidburnett on 12/09/2017.
 */
public class AthleteTest {

    Athlete athlete1;
    Run run1;

    @Before
    public void before(){
        athlete1 = new Athlete("Dave");
        run1 = new Run(45.00, 10, 100);

    }

    @Test
    public void testAthleteName(){
        assertEquals("Dave", athlete1.getName());
    }

    @Test
    public void testAddingActivity(){
        athlete1.addActivity(run1);
        assertEquals(1,athlete1.getActivities().size());
    }



}