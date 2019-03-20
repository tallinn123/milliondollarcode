package lesson11_enums_oop.oop.example;

public class Dog extends Animal {

    public boolean isBarkind() {
        return true;
    }

    @Override
    public String eatingType() {
        return "carnivor";
    }

    @Override
    public String breathingType() {
        return "lungs";
    }
}
