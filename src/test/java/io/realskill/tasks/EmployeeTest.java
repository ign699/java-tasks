package io.realskill.tasks;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * Created by John on 2016-07-06.
 */
public class EmployeeTest {
    @Test
    public void EmployeeiSPublic() throws Exception{
        //      Given
        Class employee = Employee.class;
        //      Then
        assertEquals(1, employee.getModifiers());
    }

    @Test
    public void fieldsAreDefault() throws Exception {
        //      Given
        Field[] fields = Employee.class.getDeclaredFields();
        //      Then
        for (int i = 0; i < fields.length; i++) {
            assertEquals(0, fields[i].getModifiers());
        }
    }

    @Test
    public void methodisprivate() throws Exception{
        //      Given
        Method[] methods = Employee.class.getDeclaredMethods();
        //      Then
        assertEquals(2, methods[0].getModifiers());
    }

    @Test
    public void constructorIspublic() throws Exception{
        //      Given
        Constructor[] constructors = Employee.class.getDeclaredConstructors();
        //      Then
        assertEquals(1, constructors[0].getModifiers());
    }



}