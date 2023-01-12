package tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

   @Test
   public void workingBikeTest() {
      //given there is a bike
      Bike okada = new Bike();
      //When i turn it on
      okada.kickStart(true);
      //check that the bike is on
      boolean okadaState = okada.getCheckSwitch();
      assertEquals(true, okadaState);
   }

   @Test
   public void workingBikeOffTest() {
      //given there is a bike
      Bike okada = new Bike();
      //When i turn it on
      okada.kickStart(true);
      //check that the bike is off
      okada.turnOffEngine(false);
      //check that the bike is off
      boolean okadaState = okada.getCheckSwitch();
      assertEquals(false, okadaState);
   }

   @Test
   public void workingBikeAccelerateGearOneTest() {
      //given there is a bike
      Bike okada = new Bike();
      //When I turn it on
      okada.kickStart(true);
      //when I accelerate on gear 1
      okada.currentSpeed(15);
      int okadaCurrentSpeed = okada.getCurrentSpeed();
      assertEquals(15,  okadaCurrentSpeed);
      okada.accelerate(1);
      int okadaAcceleration = okada.getAcceleration();
      assertEquals(16,  okadaAcceleration);


   }
   @Test
   public void workingBikeAccelerateGearTwoTest() {
      //given there is a bike
      Bike okada = new Bike();
      //When I turn it on
      okada.kickStart(true);
      //when I accelerate on gear 2
      okada.currentSpeed(24);
      int okadaCurrentSpeed = okada.getCurrentSpeed();
      assertEquals(24,  okadaCurrentSpeed);
      okada.accelerate(1);
      int okadaAcceleration = okada.getAcceleration();
      assertEquals(26,  okadaAcceleration);


   }
   @Test
   public void workingBikeAccelerateGearThree() {
      //given there is a bike
      Bike okada = new Bike();
      //When I turn it on
      okada.kickStart(true);
      //when I accelerate on gear 3
      okada.currentSpeed(35);
      int okadaCurrentSpeed = okada.getCurrentSpeed();
      assertEquals(35,  okadaCurrentSpeed);
      okada.accelerate(1);
      int okadaAcceleration = okada.getAcceleration();
      assertEquals(38,  okadaAcceleration);


   }

   @Test
   public void workingBikeAccelerateGearFour() {
      //given there is a bike
      Bike okada = new Bike();
      //When I turn it on
      okada.kickStart(true);
      //when I accelerate on gear 4
      okada.currentSpeed(44);
      int okadaCurrentSpeed = okada.getCurrentSpeed();
      assertEquals(44,  okadaCurrentSpeed);
      okada.accelerate(1);
      int okadaAcceleration = okada.getAcceleration();
      assertEquals(48,  okadaAcceleration);


   }

   @Test
   public void workingBikeDeccelerateGearOne() {
      //given there is a bike
      Bike okada = new Bike();
      //When I turn it on
      okada.kickStart(true);
      //when I accelerate on gear 1
      okada.currentSpeed(15);
      int okadaCurrentSpeed = okada.getCurrentSpeed();
      assertEquals(15,  okadaCurrentSpeed);
      okada.deccelerate(1);
      int okadaDecceleration = okada.getDecceleration();
      assertEquals(14,  okadaDecceleration);


   }

   @Test
   public void workingBikeDeccelerateGearTwo() {
      //given there is a bike
      Bike okada = new Bike();
      //When I turn it on
      okada.kickStart(true);
      //when I accelerate on gear 2
      okada.currentSpeed(24);
      int okadaCurrentSpeed = okada.getCurrentSpeed();
      assertEquals(24,  okadaCurrentSpeed);
      okada.deccelerate(1);
      int okadaDecceleration = okada.getDecceleration();
      assertEquals(22,  okadaDecceleration);


   }

   @Test
   public void workingBikeDeccelerateGearThree() {
      //given there is a bike
      Bike okada = new Bike();
      //When I turn it on
      okada.kickStart(true);
      //when I accelerate on gear 3
      okada.currentSpeed(35);
      int okadaCurrentSpeed = okada.getCurrentSpeed();
      assertEquals(35,  okadaCurrentSpeed);
      okada.deccelerate(1);
      int okadaDecceleration = okada.getDecceleration();
      assertEquals(32,  okadaDecceleration);


   }

   @Test
   public void workingBikeDeccelerateGearFour() {
      //given there is a bike
      Bike okada = new Bike();
      //When I turn it on
      okada.kickStart(true);
      //when I accelerate on gear 4
      okada.currentSpeed(44);
      int okadaCurrentSpeed = okada.getCurrentSpeed();
      assertEquals(44,  okadaCurrentSpeed);
      okada.deccelerate(1);
      //int okadaDecceleration = okada.getDecceleration();
      assertEquals(40,  okada.getDecceleration());


   }
   @Test
   public void workingBikeAutoAccelerateToGearFour() {
      //given there is a bike
      Bike okada = new Bike();
      //When I turn it on
      okada.kickStart(true);
      //when I accelerate on gear 3
      okada.currentSpeed(39);
      okada.accelerate(1);
      //assert that gear has changed to 4
      okada.gearNumber();
      assertEquals(4,  okada.getGearNumber());

   }

   @Test
   public void workingBikeAutoDeccelerateToGearTwo() {
      //given there is a bike
      Bike okada = new Bike();
      //When I turn it on
      okada.kickStart(true);
      //when I accelerate on gear 3
      okada.currentSpeed(31);
      okada.deccelerate(1);
      //assert that gear has changed to 2
      okada.gearNumber();
      assertEquals(2,  okada.getGearNumber());

   }

   @Test
   public void workingBikeAutoDeccelerateFromGearThreeToGearone() {
      //given there is a bike
      Bike okada = new Bike();
      //When I turn it on
      okada.kickStart(true);
      //when I accelerate on gear 3
      okada.currentSpeed(31);
      okada.deccelerate(7);

      //assert that gear has changed to 2
      okada.gearNumber();
      assertEquals(1,  okada.getGearNumber());


   }
}

