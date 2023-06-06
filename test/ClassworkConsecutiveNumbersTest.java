import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ClassworkConsecutiveNumbersTest {

    @Test
    public void confirmNumberAtIndexTest() {

        assertEquals(7,  ClassworkConsecutiveNumbers.numberAtTheQueriedIndex(
                7, 36, 2));
    }

}