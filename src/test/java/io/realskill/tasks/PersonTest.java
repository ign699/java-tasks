package io.realskill.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by John on 2016-07-06.
 */

public class PersonTest {

    @Test
    public void should_return_false_when_temp_too_big() throws Exception {
        //      Given
        Glass glass = new Glass(300, 60);
        Bottle bottle = new Bottle(300, 61);
        Person person = new Person(glass, bottle);
        //      Then
        assertEquals(false, person.fillTheGlass());
    }

    @Test
    public void should_return_false_when_volume_too_big() throws Exception {
        //      Given
        Glass glass = new Glass(300, 60);
        Bottle bottle = new Bottle(301, 60);
        Person person = new Person(glass, bottle);
        //      Then
        assertEquals(false, person.fillTheGlass());
    }

    @Test
    public void should_return_true_when_not_to_big_or_hot() throws Exception {
        //      Given
        Glass glass = new Glass(300, 60);
        Bottle bottle = new Bottle(300, 60);
        Person person = new Person(glass, bottle);
        //      Then
        assertEquals(true, person.fillTheGlass());
        assertEquals(300, glass.getHowFull());
    }

    @Test
    public void should_return_true_and_decrease_bottle_volume() throws Exception {
        //      Given
        Glass glass = new Glass(300, 60);
        Bottle bottle = new Bottle(500, 60);
        Person person = new Person(glass, bottle);
        //      Then
        assertEquals(false, person.pourNoMatterWhat());
        assertEquals(200, bottle.getVolume());
    }
}