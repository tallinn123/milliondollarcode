package lesson12_exeptions_generics.generics.basics;

public class GenericBoxTest {

    public static void main(String[] args) {
        Car car = new Car();

        GenericBox<Car> aBoxWithCarInIt = new GenericBox<>(car);
        aBoxWithCarInIt.getItem().getMaxSpeed(); // I could reach to car object without casting

        Aeroplane aeroplane = new Aeroplane();
        GenericBox<Aeroplane> aBoxWithAeroplaneInIt = new GenericBox<>(aeroplane);
        aBoxWithAeroplaneInIt.getItem().getWingSpan();
    }
}
