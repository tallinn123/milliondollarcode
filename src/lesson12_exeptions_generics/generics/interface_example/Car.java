package lesson12_exeptions_generics.generics.interface_example;

public class Car implements Comparable<Car> {

    private int maxSpeed;

    public Car (int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public int compareTo(Car otherCar){
        return this.maxSpeed-otherCar.maxSpeed;
    }

}
