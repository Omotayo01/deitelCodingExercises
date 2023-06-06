package ClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDigitsInEachElementOfAnArrayTest {

    @Test
    public void confirmNumberAtIndexTest() {

        String [] input = {"Ab1396", "Q2RBS", "G381ac"};

        assertEquals(8,  NumberOfDigitsInEachElementOfAnArray.numberOfDigitsInEachElementOfAnArray(input));
    }

}