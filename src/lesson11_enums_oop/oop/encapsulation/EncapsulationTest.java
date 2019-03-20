package lesson11_enums_oop.oop.encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {

        Encapsulation1 encapsulation1 = new Encapsulation1("value_foo", "value_bar", false);

        System.out.println("Bar value 1 : "+encapsulation1.getBar());
        System.out.println("Bar value 2 : "+encapsulation1.getFoo());

       encapsulation1.setBar("Bar value 2: " + "bar_value_difference");
        System.out.println(encapsulation1.getBar());

        encapsulation1.setFoo("Bar value 1 : "+ "foo_value_difference");
        System.out.println(encapsulation1.getFoo());
    }
}
