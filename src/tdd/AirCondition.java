package tdd;

public class AirCondition {

    private boolean checkSwitch;
    private int temperature = 16;

    public boolean getCheckSwitch() {
        return checkSwitch;
    }

    public void startAc(boolean onOff) {
        if( onOff == true)
            checkSwitch = true;
    }

    public void offAc(boolean onOff) {
        if ( onOff == false)
            checkSwitch = false;
    }
    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature(int increment) {

        if ((temperature + increment) > 30)
            temperature = 30;
        else
        temperature = temperature + increment;

        }

    public void decreaseTemperature(int decrement) {

        if ((temperature - decrement) < 16)
            temperature = 16;
        else
            temperature = temperature - decrement;
    }
}

