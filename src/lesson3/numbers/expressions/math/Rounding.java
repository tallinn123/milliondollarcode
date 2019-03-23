package lesson3.numbers.expressions.math;

// Rounding Functions Provided by the Math Class

public class Rounding {
    /*
    Method              Explanation

    ceil(argument)      Returns the smallest double value that is an integer
                        and is greater than or equal to the value of the argument.

    floor(argument)     Returns the largest double value that is an integer and
                        is less than or equal to the value of the argument.

    rint(argument)      Returns the double value that is an integer and is closest
                        to the value of the argument. If two integer values are
                        equally close, it returns the one that is even. If the argument
                        is already an integer, it returns the argument value.

    round(argument)     Returns the integer that is closest to the argument.
                        If the argument is a double, it returns a long.
                        If the argument is a float, it returns an int.
*/
    public static void main(String[] args)
    {
        double x = 29.4;
        double y = 93.5;
        double z = -19.3;

                                                                // System.out.println();
        System.out.println("round(x) = " + Math.round(x));      // round(x) = 29    rounds up or down to 0
        System.out.println("round(y) = " + Math.round(y));      // round(y) = 94
        System.out.println("round(z) = " + Math.round(z));      // round(z) = -19
        System.out.println();
        System.out.println("ceil(x) = " + Math.ceil(x));        // ceil(x) = 30.0   rounds up to 0.0
        System.out.println("ceil(y) = " + Math.ceil(y));        // ceil(y) = 94.0
        System.out.println("ceil(z) = " + Math.ceil(z));        // ceil(z) = -19.0
        System.out.println();
        System.out.println("floor(x) = " + Math.floor(x));      // floor(x) = 29.0  rounds down 0.0
        System.out.println("floor(y) = " + Math.floor(y));      // floor(y) = 93.0
        System.out.println("floor(z) = " + Math.floor(z));      // floor(z) = -20.0
        System.out.println();
        System.out.println("rint(x) = " + Math.rint(x));        // rint(x) = 29.0   rounds up and down to 0.0
        System.out.println("rint(y) = " + Math.rint(y));        // rint(y) = 94.0
        System.out.println("rint(z) = " + Math.rint(z));        // rint(z) = -19.0
    }
}