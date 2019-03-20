package lesson12_exeptions_generics.exeptions;

public class CarTest {

    public static void main(String[] args) throws CarCrashedException{ // "throws CarCrashedException" is method signature  what should be handled also in main method
        Car car = new Car(50);
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
    }
}
