package TortoiseAndHare;

import TortoiseAndHare.RaceCourse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RaceCourseTest {

    private RaceCourse raceCourse;

    @BeforeEach

    void setUp(){
        raceCourse = new RaceCourse();
    }

    @Test

    public void testThatRaceCourseExists(){

        assertNotNull(raceCourse);
    }

    @Test

    public void testThatRaceCourseHasRaceTrack(){

        assertNotNull(raceCourse);
        assertNotNull(raceCourse.getRaceTrack());

    }

    @Test

    public void testThatRaceCourseHasPail(){

        assertNotNull(raceCourse);
        assertNotNull(raceCourse.getPail());

    }
}


