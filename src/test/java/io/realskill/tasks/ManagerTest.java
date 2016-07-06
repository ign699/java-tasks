package io.realskill.tasks;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * Created by John on 2016-07-06.
 */
public class ManagerTest {

    @Test
    public void constructorIspublic() throws Exception{
        //      Given
        Constructor[] constructors = Manager.class.getDeclaredConstructors();
        //      Then
        assertEquals(4, constructors[0].getModifiers());
    }

    @Test
    public void methodisprivate() throws Exception{
        //      Given
        Method[] methods = Manager.class.getDeclaredMethods();
        //      Then
        assertEquals(2, methods[0].getModifiers());
    }

}