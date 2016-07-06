package io.realskill.tasks;

/**
 * Created by John on 2016-07-05.
 */
public class Manager extends Employee {

    protected Manager(int salary, String name) {
        super(salary, name);
    }

    private boolean hire(){
        return true;
    }


}
