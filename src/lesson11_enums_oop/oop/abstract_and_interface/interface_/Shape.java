package lesson11_enums_oop.oop.abstract_and_interface.interface_;

public interface Shape {

    double getArea(); // interface methods are public as default
    double getPerimeter(); // interface cn not be private or protected

    default void printMyName(){ // interfaces can have only 1 method type with body and have default prefix as a keyword
        System.out.println("My name is bla bla");
    }

}

