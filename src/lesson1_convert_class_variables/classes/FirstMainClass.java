package lesson1_convert_class_variables.classes;

public class FirstMainClass {

    public static void main(String[] args) {

        SecondPublicClass muutuja = new SecondPublicClass(); // 7

        muutuja.sayHello(); // nimetab objektile muutuja meetodi, mis on määratud teises klassis.
    }
}
/*
7   The first line in the body of the main method creates a variable named muutuja that can
    hold objects created from the SecondPublicClass class. Then it creates a new object
    using the SecondPublicClass class and assigns this object to the muutuja variable.

9)   The second line in the body of the main method calls the muutuja object’s
     sayHello method. As you’ll see in a moment, this method simply displays the message
    "Hello, hello world!" from the SecondPublicClass.
*/