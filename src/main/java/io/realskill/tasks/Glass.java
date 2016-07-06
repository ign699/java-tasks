package io.realskill.tasks;

/**
 * Created by John on 2016-07-06.
 */
public class Glass {
    private int maxVolume = 500;
    private int maxTemp = 70;
    private int howFull = 0;

    public Glass(int volume, int maxTemp) {
        this.maxVolume = volume;
        this.maxTemp = maxTemp;
    }


    public void fillGlass(Bottle bottle) throws TooMuchWaterException, WaterTooHotException{

        if(howFull + bottle.getVolume() > maxVolume){
            throw new TooMuchWaterException();
        }

        if(bottle.getTemperature() > maxTemp){
            throw new WaterTooHotException();
        }


        howFull+=bottle.getVolume();
    }

    public int getHowFull() {
        return howFull;
    }

    public int getMaxVolume(){
        return maxVolume;
    }
}
