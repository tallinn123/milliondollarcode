package lesson12_exeptions_generics.exeptions;

public class Car {
    private int carSpeed;

    public Car(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public void increaseSpeed() throws CarCrashedException{ // exeption what should be handled used by method signature
        carSpeed = carSpeed + 70;

        if (carSpeed > 200) {
            throw new CarCrashedException(this); // "This" is used to point out class itself
        }
    }
}
