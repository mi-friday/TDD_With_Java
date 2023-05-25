package chibuzoAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

   @Test
   public void turnTvOnTest(){
     //given that i have a tv and it is off
    Television television = new Television();
    //when i turn it on
    Television.switchOn();
     //check that it is on
    assertTrue(Television.isOn());
   }
   @Test
   public void turnTvOffTest(){
       //given that i have a tv and it is on
     Television television = new Television();
       //when i turn it off
     Television.switchOff();
       //check that it is off
     assertTrue(Television.isOn());
   }

   @Test
   public void changeChannelTest(){
      //given that my tv is on
     Television television = new Television();
      //when i change channel
       




   }

}