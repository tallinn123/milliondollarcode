package lesson12_exeptions_generics.generics.basics;

public class NormalBoxTest {

    public static void main(String[] args) {
        Car car = new Car();
        NormalBox box = new NormalBox(car);

        Car carFromBox = (Car) box.getItem(); // I could reach to car object with casting

       // Aeroplane aeroplaneFromBox = (Aeroplane) normalBox.getItem(); // this is an example of unsafe casting
    }
}
