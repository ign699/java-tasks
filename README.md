# Java Private/Public/Protected

##Summary

Very simple access modifiers.

##Goal

Implement three classes Employee, Manager, Boss:

Employee:
* Class Employee should be avalible only within io.realskill.tasks package
* Should have to fields name and salary that should also be avalible only within io.realskill.tasks package
* It's constructor should be visible globally
* Have a method work() (implementation does not matter) that will not be passed down to its subclasses

Manager:
* Extends class Employee
* Should have a method hire that is only accessible by this class
* You should only be able to create Manager instances within io.realskill or in classes that extend class manager

Boss:
* Extend Employee
* It's constructor should only allow to create boss instances within this class
* Class Boss should be package private



##To verify your solution

    mvn test
    
or 

    mvn clean test
    
or to run tests faster

    mvn test -P -realskill
