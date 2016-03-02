# Java Inheritance

##Summary

Very simple interfaces & inheritance.

##Goal

Implement model to represent different water area types.
So every Basin should have a name and know what larger basing it's part of, if any.
So Basin interface should have following methods:

* getName() that returns string
* getSurroundingBasin() that returns basin that current basin is part of

There should be Lake, Sea and Ocean. In order to resue some bits of code, those classes should extend AbstractBasin.
AbstractBasin should:
 
* store name as "name" field and NOT allow sub classes to change it
* store surrounding basin as "surroundingBasin" field and ALLOW sub classes to change it
* have constructor with name
* have constructor with name and surrounding basin
* redefine toString method so that when there is no surrounding basin then return "[name] is not part of any larger basin"; 
    otherwise return "[name] is part of [surroundingBasin.name]"
* have public isPartOfBiggerBasin method that returns true if surroundingBasin is set; false otherwise

Since lakes are never parts of any larger basins Lake class may have only one constructor with name.
Since lake names rarely include "lake" word in it's name then Lake class should redefine toString method to include "lake" word right after name.
The rest of toString should be similar to what AbstractBasin does.

Ocean should have only one constructor with name, as it is never part of any bigger Basin.

Sea can only be a part of BigBasin so Ocean and Sea should implement that interface. So it should not be possible to create Sea with surroundingBasin
of type Lake.
Method getSurroundingBasin of Sea class should return BigBasin instead of Basin.

It should be possible to put Lake, Sea and Ocean in one generic Set<Basin>.

**You are allowed to modify only files in src/main directory**

##To verify your solution

    mvn test
    
or 

    mvn clean test
    
or to run tests faster

    mvn test -P -realskill
