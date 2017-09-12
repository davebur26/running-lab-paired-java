package com.example.davidburnett.runninglab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 12/09/2017.
 */
public class RunTest {

    Run run1;

    @Before
    public void before(){
        run1 = new Run(45.00, 10, 100);
    }

    @Test
    public void testRunBasicInfo(){
        assertEquals(45.00, run1.getTime());
        assertEquals(10, run1.getDistance());
        assertEquals(100, run1.getAltitudeGained());
    }

}