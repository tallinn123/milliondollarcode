package lesson11_enums_oop.oop.inheritance;

public class Vehicle{ //"extends Object" is here as default

    private int maxSpeed;

    public String name = "vehicle name";

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String vehicleType(){
        return "big_vehicle";
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}