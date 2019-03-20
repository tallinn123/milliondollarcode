package lesson12_exeptions_generics.exeptions;

public class CarCrashedException extends Exception {

    public CarCrashedException (Car car){ // we sent cat to know which car has been crashed
        super("Car " + car + "has crashed!");

    }
}


