package lesson1_convert_class_variables.variables;

public class Variables {

    static int x;   // Class variable. Its scope begins in line 5 and ends in line 25. As a result, both the main method and the
                    // myMethod method can access it.

    public static void main(String[] args) {
        x = 5;
        System.out.println("main: x = " + x); // 5
        myMethod();             // new Method inside the main method
    }

    public static void myMethod() {
        int y;              // The variable y is a local variable. Its scope begins in line 15 and ends in line 24
        y = 10;             // local variable that’s declared and initialized in the if statement block in line 17
        if (y == x + 5) {
            int z;          // The scope of variable z begins when the variable is initialized in line 18 and ends when the statement block ends in line 21.
            z = 15;
            System.out.println("myMethod: z = " + z);  // 15
        }
        System.out.println("myMethod: x = " + x);  // 5
        System.out.println("myMethod: y = " + y); // 10
    }
}