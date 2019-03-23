package lesson1_convert_class_variables.convert;

// Boxing occurs when Java converts a primitive value to its corresponding wrapped object

public class ConvertBoxing {

    public static void main(String[] args) {

        Integer wrap = 10;
        System.out.println(wrap); // 10

        int prim = wrap + 1;
        System.out.println(prim); // 11

        int three = prim + 2;
        System.out.println(three); // 13
    }
}
