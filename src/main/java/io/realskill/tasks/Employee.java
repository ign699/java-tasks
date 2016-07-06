package io.realskill.tasks;

/**
 * Created by John on 2016-07-05.
 */

public class Employee{

    String name;
    int salary;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }


    private boolean work() {
        return true;
    }
}
