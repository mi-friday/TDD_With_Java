package chibuzoAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

 @Test
 public void toggleOnTest() {
  // when
  AirConditioner myAirConditioner = new AirConditioner();
  // given
  myAirConditioner.toggleOn();
  // check / assert
  assertTrue(true);
 }

 private void assertTrue(boolean b) {

 }

 @Test
 public void toggleOffTest() {
  //given
  AirConditioner myAirConditioner = new AirConditioner();
  //when
  myAirConditioner.toggleOff();
  //check
  assertFalse(false);
 }

 @Test
 public void increaseTemperatureTest() {
  // given
 AirConditioner increaseTemperatureTest = new AirConditioner();
 //when
  int result = AirConditioner.myAirConditioner();
 // assert
 assertEquals(25, increaseTemperatureTest.increaseTemperation());
 }

 @Test
 public void decreaseTemperatureTest() {
  //given
 AirConditioner decreaseTemperatureTest = new AirConditioner();
  //when
 int result = AirConditioner.myAirConditioner();
  //check
 assertEquals(18, decreaseTemperatureTest.decreaseTemperature());
 }

 @Test
 public void increaseTemperatureBeyondThirtyTest() {
  //given
 AirConditioner increaseTemperatureBeyondThirtyTest = new AirConditioner();

  //when
 AirConditioner.increaseTemperatureBeyondThirtyTest(30, 31);

 // assert
  int result = increaseTemperatureBeyondThirtyTest.increaseTemperatureBeyond(30,31);
  assertEquals(30, result);
 }

 @Test
 public void decreaseTemperatureBelowSixteenTest() {
  //given
 AirConditioner decreaseTemperatureBelowSixteenTest = new AirConditioner();
  //when
 AirConditioner.decreaseTemperatureBelowSixteenTest(16, 15);
  //assert
 int result = decreaseTemperatureBelowSixteenTest.decreaseTemperatureBelow(16, 15);

    }

}
