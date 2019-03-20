package lesson12_exeptions_generics.generics.extends_example;

public class Garage<T extends Vehicle> { // Garage class axxepts only Vehicle type objects

    private T vehicle;

    public Garage(T vehicle) { // constructor
        this.vehicle = vehicle;
    }

    public void repairVehicle(){
        vehicle.repair();
    }

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }
}
