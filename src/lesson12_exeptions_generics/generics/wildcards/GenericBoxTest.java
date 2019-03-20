package lesson12_exeptions_generics.generics.wildcards;

public class GenericBoxTest {
    private void printItemInside(GenericBox<?>box){
        System.out.println(box.getItem());
    }
    public static void main(String[] args) {
        GenericBoxTest genericBoxTest = new GenericBoxTest();

        Car car = new Car();
        GenericBox<Car> aBox = new GenericBox<>(car);
        genericBoxTest.printItemInside(aBox);
    }
}
