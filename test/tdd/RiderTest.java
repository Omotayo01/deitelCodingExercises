package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RiderTest {


    @Test
    public void FiftyPercentOfRiderDeliveriesCompletedTest() {
        //given there is a bike
        Rider tolu = new Rider();
        //when he delivers 50 parcels outta 100 in same day
        tolu.collectionRateInPercentage(50, 100);
        // What is his bonus on delivered parcels
        assertEquals(10_000.0, tolu.getRiderBonus());

    }
    @Test
    public void LessThanFiftyPercentOfRiderDeliveriesCompletedTest() {
        //given there is a bike
        Rider tolu = new Rider();
        //when he delivers 50 parcels outta 100 in same day
        tolu.collectionRateInPercentage(53, 130);
        // What is his bonus on delivered parcels
        assertEquals(0, tolu.getRiderBonus());

    }

    @Test
    public void FiftyNinePercentOfRiderDeliveriesCompletedTest() {
        //given there is a bike
        Rider tolu = new Rider();
        //when he delivers 59 parcels outta 100 in same day
        tolu.collectionRateInPercentage(59, 100);
        // What is his bonus on delivered parcels
        assertEquals(11_800.0, tolu.getRiderBonus());

    }
    @Test
    public void SixtyPercentOfRiderDeliveriesCompletedTest() {
        //given there is a bike
        Rider tolu = new Rider();
        //when he delivers 60 parcels outta 100 in same day
        tolu.collectionRateInPercentage(60, 100);
        // What is his bonus on delivered parcels
        assertEquals(15_000.0, tolu.getRiderBonus());

    }

    @Test
    public void SixtyNinePercentOfRiderDeliveriesCompletedTest() {
        //given there is a bike
        Rider tolu = new Rider();
        //when he delivers 69 parcels outta 100 in same day
        tolu.collectionRateInPercentage(69, 100);
        // What is his bonus on delivered parcels
        assertEquals(17_250.0, tolu.getRiderBonus());

    }

    @Test
    public void SeventyPercentOfRiderDeliveriesCompletedTest() {
        //given there is a bike
        Rider tolu = new Rider();
        //when he delivers 70 parcels outta 100 in same day
        tolu.collectionRateInPercentage(70, 100);
        // What is his bonus on delivered parcels
        assertEquals(35_000.0, tolu.getRiderBonus());

    }

    @Test
    public void EightyThreePercentOfRiderDeliveriesCompletedTest() {
        //given there is a bike
        Rider tolu = new Rider();
        //when he delivers 83 parcels outta 100 in same day
        tolu.collectionRateInPercentage(83, 100);
        // What is his bonus on delivered parcels
        assertEquals(41_500.0, tolu.getRiderBonus());

    }
}
