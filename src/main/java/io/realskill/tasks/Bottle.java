package io.realskill.tasks;

/**
 * Created by John on 2016-07-06.
 */
public class Bottle {
    private int temperature;
    private int volume;

    public Bottle(int volume, int temperature) {
        this.temperature = temperature;
        this.volume = volume;
    }


    public int getTemperature() {
        return temperature;
    }

    public int getVolume() {
        return volume;
    }
    public void deacreseVolume(int volume){
        this.volume-=volume;
    }
}
