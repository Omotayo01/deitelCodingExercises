package tdd.ChapterThree;

import org.junit.jupiter.api.Test;
import tdd.chapterThree.Car;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    @Test
    public void carApplicationThatCarIsCreatedTest() {
        //given there is a bike
        Car nissan = new Car( "", "", 0.0);

        assertNotNull(nissan);
    }

    @Test
    public void ThatPriceReturnNullUponCreationTest() {
        //given there is a bike
        Car nissan = new Car("", "", 0.0);
//assert that the price is null since it hasn't been set
        assertEquals(0, nissan.getCarPrice());

    }

    @Test
    public void setCarModelTest() {
        //given there is a bike
        Car nissan = new Car("", "", 0.0);
        // given that I set the model to Bluebird
        nissan.carModel("Bluebird");
//assert that the car model name is bluebird
        assertEquals("Bluebird", nissan.getCarModel());
    }
    @Test
    public void carValueRemainsNullIfPriceIsNegativeTest() {
        //given there is a bike
        Car nissan = new Car("", "", 0.0);
        // given that I set the model to Bluebird
        nissan.carPrice(-13_000);
//assert that the car model name is bluebird
        assertEquals(0, nissan.getCarPrice());
    }

    @Test
    public void createTwoObjectsOfCarAndSetThePricesTest() {
        //given there is a bike
        Car nissan = new Car( "", "", 0.0);
        Car toyota = new Car("", "", 0.0);
        nissan.carPrice(10_000);
        toyota.carPrice(14_000);
        assertEquals(10_000, nissan.getCarPrice());
        assertEquals( 14_000, toyota.getCarPrice());
    }

    @Test
    public void getDiscountOnCarsTest() {
        //given there is a bike
        Car nissan = new Car( "", "", 0.0);
        Car toyota = new Car("", "", 0.0);
        nissan.carPrice(10_000);
        assertEquals(10_000, nissan.getCarPrice());
        toyota.carPrice(14_000);
        assertEquals( 14_000, toyota.getCarPrice());
        nissan.carDiscount(5.0);
        assertEquals( 9_500, nissan.getCarPrice());
        toyota.carDiscount(7.0);
        assertEquals( 13_020, toyota.getCarPrice());



    }
}


