package io.realskill.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by John on 2016-07-06.
 */
public class BottleTest {

    @Test
    public void should_deacrese_volume_by_given_value() throws Exception {
        //      Given
        Bottle bottle = new Bottle(100, 50);
        //      When
        bottle.deacreseVolume(50);
        //      Then
        assertEquals(50, bottle.getVolume());
    }
}