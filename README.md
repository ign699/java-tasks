# Java Exceptions

##Summary

Very simple Exceptions.

##Goal

Implement a model for a glass that cant throw two exceptions:
* when it can't be filled because it will overflow
* when it can't be filled because the glass will break

We want the glass to have a  three methods fillGlass, getHowFull and getMaxVolume.

Create glass class that has three methods: getTemperature, getVolume, decreaseVolume;

Implement a model for a bottle that contains certain amount of water at a certain temperature

Create a model for a Person. A Person should be able to have a bottle and a glass.
A Person should have three methods: fillTheGlass and pourNoMatterWhat.
Both of these methods should be able to fill the glass and return true when they manged to pour the water to the glass or false
when it didn't.

The second method should do exactly the same but should also decrease volume of the bottle by the maxVolume of the glass
whether it did or did not manage to fill the glass.







##To verify your solution

    mvn test
    
or 

    mvn clean test
    
or to run tests faster

    mvn test -P -realskill
