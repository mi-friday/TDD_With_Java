package chibuzoAssignment;

public class Bike {
    private int speed;
    private int gear;
    private boolean isOn;


    public void isOn() {
        isOn = true;

    }

    public boolean turnOn() {
        return isOn;
    }

    public void turnOff() {
        isOn = false;
    }


    public void accelerate() {
        if(isOn) {
            if(speed >= 0 && speed <= 20){
                speed = speed + 1;
            }else if (speed >= 21 && speed <= 30){
                speed = 2+speed;
            } else if (speed >= 31 && speed <= 40) {
                speed = speed + 3;
            }else if(speed >= 41 ){
                speed = speed + 4;
            }
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void decelerate() {
        if (isOn){
            if (speed >= 41){
                speed = speed - 4;
            } else if (speed >= 31) {
                speed = speed -3;
            } else if (speed >= 21) {
                speed = speed -2;
            }
        }
    }

    public String selectGear() {
        if(isOn) {
            if(speed >= 41){
                return "Gear 4";
            }else if (speed >= 31){
                return "Gear 3";
            } else if (speed >= 21) {
               return "Gear 2";
            }else if(speed >= 0 ){
                return "Gear 1";
            }
        }
        return null;
    }
}
