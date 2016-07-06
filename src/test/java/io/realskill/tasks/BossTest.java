package io.realskill.tasks;

import org.junit.Test;

import java.lang.reflect.Constructor;

import static org.junit.Assert.*;

/**
 * Created by John on 2016-07-06.
 */
public class BossTest {
    @Test
    public void BossiSDefualt() throws Exception{
        //      Given
        Class boss = Boss.class;
        //      Then
        assertEquals(0, boss.getModifiers());

    }

    @Test
    public void ConstructoriSPrivate() throws Exception{
        //      Given
        Constructor[] boss = Boss.class.getDeclaredConstructors();
        //      Then
        assertEquals(2, boss[0].getModifiers());
    }

}