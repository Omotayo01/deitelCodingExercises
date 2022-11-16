package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtmeTest {
    @Test
    public void utmeDrillerForOneCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(1);
        assertEquals(2000, costOfCopy);

    }

    @Test
    public void utmeDrillerForfourCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(4);
        assertEquals(8000, costOfCopy);
    }

    @Test
    public void utmeDrillerForFiveCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(5);
        assertEquals(9000, costOfCopy);
    }

    @Test
    public void utmeDrillerForTenCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(10);
        assertEquals(16000, costOfCopy);
    }

    @Test
    public void utmeDrillerForZeroCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(0);
        assertEquals(0, costOfCopy);
    }
    @Test
    public void utmeDrillerForTwentyNineCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(29);
        assertEquals(46400, costOfCopy);
    }

    @Test
    public void utmeDrillerForThirtyCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(30);
        assertEquals(45000, costOfCopy);
    }

    @Test
    public void utmeDrillerForFortyNineCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(49);
        assertEquals(73500, costOfCopy);
    }

    @Test
    public void utmeDrillerForFiftyCopiesTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(50);
        assertEquals(65000, costOfCopy);
    }

    @Test
    public void utmeDrillerForNinetyNineCopiesTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(99);
        assertEquals(128700, costOfCopy);
    }

    @Test
    public void utmeDrillerForOneHundredCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(100);
        assertEquals(120000, costOfCopy);
    }

    @Test
    public void utmeDrillerForOneHundredAndNinetyNineCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(199);
        assertEquals(238800, costOfCopy);
    }
    @Test
    public void utmeDrillerForTwoHundredCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(200);
        assertEquals(220000, costOfCopy);
    }

    @Test
    public void utmeDrillerForFourHundredAndNinetyNineCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(499);
        assertEquals(548900, costOfCopy);
    }

    @Test
    public void utmeDrillerForFiveHundredCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(500);
        assertEquals(500000, costOfCopy);
    }

    @Test
    public void utmeDrillerForSixHundredCopyTest() {
        Utme Omotayo = new Utme();
        //given that I bought one copy
        int costOfCopy = Omotayo.copies(600);
        assertEquals(600000, costOfCopy);
    }
}

