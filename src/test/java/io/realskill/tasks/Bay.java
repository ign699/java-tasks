package io.realskill.tasks;

public class Bay extends AbstractBasin {

    public Bay(String name, Basin surroundingBasin)
    {
        super(name, surroundingBasin);
        if (!(surroundingBasin instanceof Sea) && !(surroundingBasin instanceof Ocean)) {
            throw new IllegalArgumentException("SurroundingBasin must be either sea or ocean");
        }
    }

    public Basin getSurroundingBasin()
    {
        return surroundingBasin;
    }

    public void mutate() throws NoSuchFieldException, IllegalAccessException
    {
        getClass().getField("name").set(this, "Szakalaka");
    }
}
