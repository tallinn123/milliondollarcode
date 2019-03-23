package lesson1_convert_class_variables.convert;

public class ConvertUnBoxing {


    static int prim; // Class variable declared in class body, can be accessed by any methods defined by the class
    static int wrap;


    public static void main(String[] args) {

        int three; // local variables defined within a method(main) can be accessed only by the method in which they are defined.
        three = prim + 2;
        System.out.println(three); // 2

        prim = wrap + 1;
        System.out.println(prim); // 1

        wrap = 10;
        System.out.println(wrap); // 10
    }
}
