package lesson11_enums_oop.enums;

public enum LengthUnit {

    METER(1),
    DECIMETER(10),
    CENTIMETER(100),
    MILLIMETER(1000);

    LengthUnit(double value){
        this.value = value;
    }
    private double value;

    public double getValue() {
        return value;
    }
}
