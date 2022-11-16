package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {

    @Test
    public void acWorkingTest() {
        //given there is an Air-conditional
        AirCondition midea = new AirCondition();
        //when I turn it on
        midea.startAc(true);
        //check that the Air-conditional is on
        boolean mideaState = midea.getCheckSwitch();
        assertEquals(true, mideaState);

    }

    @Test
    public void acTurnOffTTest() {
        //given there is an Air-conditional
        AirCondition midea = new AirCondition();
        //when I turn it on
        midea.startAc(true);
        //when I turn it off
        midea.offAc(false);
        //check that the Air-conditional is off
        boolean mideaState = midea.getCheckSwitch();
        assertEquals(false, mideaState);

    }



    @Test
    public void acIncreaseTemperatureTest() {
        //given there is an Air-conditional
        AirCondition midea = new AirCondition();
        //when I turn it on
        midea.startAc(true);
        //when I increase the temperature
        midea.increaseTemperature(2);
        //check that the Air-conditional has increased in temperature
        int mideaTemperature = midea.getTemperature();
        assertEquals(18, mideaTemperature);
    }

    @Test
    public void acDecreaseTemperatureTest() {
        //given there is an Air-conditional
        AirCondition midea = new AirCondition();
        //when I turn it on
        midea.startAc(true);
        //when I increase the temperature
        midea.increaseTemperature(2);
        //when I decrease the temperature
        midea.decreaseTemperature(1);
        //check that the Air-conditional has increased in temperature
        int mideaTemperature = midea.getTemperature();
        assertEquals(17, mideaTemperature);
    }

    @Test
    public void acImpossibleTemperatureIncreaseTest() {
        //given there is an Air-conditional
        AirCondition midea = new AirCondition();
        //when I turn it on
        midea.startAc(true);
        //when I increase the temperature to 30
        midea.increaseTemperature(14);
        //when I try to increase the temperature beyond 30
        midea.increaseTemperature(1);
        //check that the Air-conditional has increased in temperature
        int mideaTemperature = midea.getTemperature();
        assertEquals(30, mideaTemperature);
    }

    @Test
    public void acImpossibleTemperatureDecreaseTest() {
        //given there is an Air-conditional
        AirCondition midea = new AirCondition();
        //when I turn it on
        midea.startAc(true);
        //when I try to decrease the temperature below 16
        midea.decreaseTemperature(1);
        //check that the Air-conditional has increased in temperature
        int mideaTemperature = midea.getTemperature();
        assertEquals(16, mideaTemperature);
    }

}
