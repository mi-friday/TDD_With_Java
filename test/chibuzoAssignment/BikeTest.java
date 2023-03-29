package chibuzoAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    public void testThatOurBikeCanOn() {
        Bike bike = new Bike();
        bike.isOn();
        assertTrue(bike.turnOn());
    }

    @Test
    public void testThatBikeCanOff() {
        Bike bike = new Bike();
        bike.isOn();
        bike.turnOff();
        assertFalse(bike.turnOn());
    }

    @Test
    public void testThatWeCanAccelerate() {
        Bike bike = new Bike();
        bike.isOn();
        bike.accelerate();
        assertEquals(1, bike.getSpeed());
        assertEquals("Gear 1", bike.selectGear());
    }

    @Test
    public void weCanAccelerateOurBikeByTwo() {
        Bike bike = new Bike();
        bike.isOn();

        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(23, bike.getSpeed());
        assertEquals("Gear 2", bike.selectGear());
    }

    @Test
    public void weCanAccelerateOurBikeByThree() {
        Bike bike = new Bike();
        bike.isOn();

        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();


        assertEquals(34, bike.getSpeed());
        assertEquals("Gear 3", bike.selectGear());

    }

    @Test
    public void testThatBikeCanAccelerateByFour(){
        Bike bike = new Bike();
        bike.isOn();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();

        assertEquals(47, bike.getSpeed());
        assertEquals("Gear 4", bike.selectGear());
    }

    @Test
    public void testThatBikeCanDecelerateByFour(){
        Bike bike = new Bike();
        bike.isOn();

        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();

        bike.decelerate();

        assertEquals(43, bike.getSpeed());
    }

    @Test
    public void testThatBikeCanDecelerateByThree(){
        Bike bike = new Bike();
        bike.isOn();

        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();

        bike.decelerate();
        assertEquals(31, bike.getSpeed());
    }

    @Test
    public void testThatBikeCanDecelerateByTwo(){
        Bike bike = new Bike();
        bike.isOn();

        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();

        bike.decelerate();
        assertEquals(21, bike.getSpeed());
    }

//    @Test
//    public void testThat

}