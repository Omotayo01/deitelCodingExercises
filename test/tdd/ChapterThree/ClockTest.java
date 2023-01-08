package tdd.ChapterThree;

import org.junit.jupiter.api.Test;
import tdd.chapterThree.Clock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClockTest {

    @Test

    public void thatAClockExistTest(){
        //that a clock is created
       Clock hublot = new Clock(00, 00, 00);
        //assert that the clock exists

        assertNotNull(hublot);

    }

    @Test

    public void setHourToOver23ToReturn0Test(){
//given that a clock exist
        Clock hublot = new Clock(00, 00, 00);

        //set the hour to over 23

        hublot.setClockHour(24);

        //get that clock hour is 00

        assertEquals(00, hublot.getCloCKHour() );
    }

    @Test

    public void setHourMinutesSecondToDisplayInRealTimeTest(){
//given that a clock exist
        Clock hublot = new Clock(00, 00, 00);

        //set the hour to over 23

        hublot.setClockHour(24);
        //set minutes
        hublot.setClockMinute(36);
        //set seconds
        hublot.setClockSecond(17);

        //get that clock hour is 00

        assertEquals("00:36:17", hublot.displayTime() );
    }

    @Test
    public void setMinuteToDisplayInRealTimeTest(){
//given that a clock exist
        Clock hublot = new Clock(00, 00, 00);

        //set the hour to over 23

        hublot.setClockHour(8);
        //set minutes
        hublot.setClockMinute(60);
        //set seconds
        hublot.setClockSecond(17);

        //get that clock hour is 00

        assertEquals("08:00:17", hublot.displayTime() );
    }


}
