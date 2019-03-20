package lesson11_enums_oop.homeworks.homework1;

public abstract class Fruit {
    private String  color;
    private  String juice;


    private  String Orange (String color, String juice) {
        this.color = color;
        this.juice = juice;
        return color;
    }

    private  String Apple (String color, String juice){
        this.color = color;
        this.juice = juice;
        return juice;
    }

    public abstract void makeJuice();
}
