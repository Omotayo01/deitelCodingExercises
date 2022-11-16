package tdd;

public class Bike {
    private boolean checkSwitch;
    private int gearNumber;
    private int acceleration;
    private int currentSpeed;
    private int decceleration;


    public boolean getCheckSwitch() {
        return checkSwitch;
    }
    public int getGearNumber() {

        return gearNumber;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getDecceleration() {

        return decceleration;
    }

    public int getAcceleration() {

        return acceleration;
    }


    public void kickStart(boolean onOff) {
        if( onOff == true)
            checkSwitch = true;
    }
    public void turnOffEngine(boolean onOff) {
        if ( onOff == false)
            checkSwitch = false;
    }

    public void gearNumber() {
        if ( acceleration >= 0 &&  acceleration <= 20 || decceleration >= 0 &&  decceleration <= 20)
            gearNumber = 1;
        if ( acceleration >= 21 &&  acceleration <= 30 || decceleration >= 21 &&  decceleration <= 30)
            gearNumber = 2;
        if ( acceleration >= 31 &&  acceleration <= 40 || decceleration >= 31 &&  decceleration <= 40)
            gearNumber = 3;
        if ( acceleration >= 41 || decceleration >= 41)
            gearNumber = 4;

    }


    public void accelerate(int increment) {
        if (  currentSpeed >= 0 &&  currentSpeed <= 20)
            acceleration = currentSpeed + increment;
        if (  currentSpeed >= 21 &&  currentSpeed <= 30)
            acceleration = (currentSpeed + (increment * 2));
        if (  currentSpeed >= 31 &&  currentSpeed <= 40)
            acceleration = (currentSpeed + (increment * 3));
        if (  currentSpeed >= 41)
            acceleration = (currentSpeed + (increment * 4));
    }

    public void currentSpeed(int speedNow) {
        currentSpeed = speedNow;

    }

    public void deccelerate(int decrement) {
        if (  currentSpeed >= 0 &&  currentSpeed <= 20)
            decceleration = currentSpeed - decrement;
        if (  currentSpeed >= 21 &&  currentSpeed <= 30)
            decceleration = (currentSpeed - (decrement * 2));
        if (  currentSpeed >= 31 &&  currentSpeed <= 40)
            decceleration = (currentSpeed - (decrement * 3));
        if (  currentSpeed >= 41)
            decceleration = (currentSpeed - (decrement * 4));
   }

     }


