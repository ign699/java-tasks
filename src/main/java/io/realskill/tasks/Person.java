package io.realskill.tasks;

/**
 * Created by John on 2016-07-06.
 */
public class Person {
    private Glass glass;
    private Bottle bottle;

    public Person(Glass glass, Bottle bottle) {
        this.glass = glass;
        this.bottle = bottle;
    }

    public boolean fillTheGlass(){
        try {
            glass.fillGlass(bottle);
        } catch (TooMuchWaterException e) {
            return false;
        } catch (WaterTooHotException e) {
            return false;
        }
        return true;
    }

    public boolean pourNoMatterWhat(){
        try {
            glass.fillGlass(bottle);
        } catch (TooMuchWaterException e) {
            return false;
        } catch (WaterTooHotException e) {
            return false;
        }
          finally {
            bottle.deacreseVolume(glass.getMaxVolume());
        }
        return true;
    }
}
