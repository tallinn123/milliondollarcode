package lesson3.numbers.expressions.math;

public class MathClass {

    /* Mathematical Functions Provided by the Math Class

    abs(b) =    50
    cbrt(x) =   2.924017738212866
    exp(y) =    54.598150033144236
    hypot(y,z)= 5.0
    log(y) =    1.0986122886681096
    log10(y) =  0.47712125471966244
    max(a, b) = 100
    min(a, b) = -50
    pow(a, c) = 1000000.0
    random() =  0.8536014557793756
    signum(b) = -1.0
    sqrt(x) =   1.7320508075688772

    Method                      Explanation

    abs(argument)               Returns the absolute value of the argument.
                                The argument can be an int, long, float, or double.
                                The return value is the same type as the argument.

    cbrt(argument)              Returns the cube root of the argument. The argument and
                                return value are doubles.

    exp(argument)               Returns e raised to the power of the argument.
                                The argument and the return value are doubles.
    hypot(arg1,arg2)            Returns the hypotenuse of a right triangle calculated according to the Pythagorean theorem —
                                √ x2 + y2. The argument and the return values are doubles.

    log(argument)               Returns the natural logarithm (base e) of the argument.
                                The argument and the return value are doubles.

    log10(argument)             Returns the base 10 logarithm of the argument. The argument and the return value are doubles.

    max(arg1, arg2)             Returns the larger of the two arguments. The arguments can be int, long, float, or double,
                                but both must be of the same type. The return type is the same type as the arguments.

    min(arg1, arg2)             Returns the smaller of the two arguments. The arguments can be int, long, float, or double,
                                but both must be of the same type. The return type is the same type as the arguments.

    pow(arg1, arg2)             Returns the value of the first argument raised to the power of the second argument.
                                Both arguments and the return value are doubles.

    random()                    Returns a random number that’s greater than or equal to 0.0 but less than 1.0.
                                This method does not accept an argument, but the return value is a double.

    signum(argument)            Returns a number that represents the sign of the argument: –1.0 if the argument is negative, 0.0 if the
                                argument is zero, and 1.0 if the argument is positive.
                                The argument can be a double or a float. The return value is the same type as the argument.

    sqrt(argument)              Returns the square root of the argument. The argument and return value are doubles.

*/

    /*
1) ✦ You can use the abs and signnum methods to force the sign of one variable to match the sign of another, like this:

int a = 27;
int b = -32;
a = Math.abs(a) * Math.signum(b); // a is now -27;
    *
    * */

    public static void main(String[] args) {
        int a = 100;
        int b = -50;
        int c = 3;
        double x = 25.0;
        double y = 3.0;
        double z = 4.0;                                         // System.out.println();
        System.out.println("abs(b) = " + Math.abs(b));          // abs(b) = 50
        System.out.println("cbrt(x) = " + Math.cbrt(x));        // cbrt(x) = 2.924017738212866
        System.out.println("exp(y) = " + Math.exp(z));          // exp(y) = 54.598150033144236
        System.out.println("hypot(y,z)= " + Math.hypot(y, z));  // hypot(y,z)= 5.0
        System.out.println("log(y) = " + Math.log(y));          // log(y) = 1.0986122886681098
        System.out.println("log10(y) = " + Math.log10(y));      // log10(y) = 0.47712125471966244
        System.out.println("max(a, b) = " + Math.max(a, b));    // max(a, b) = 100
        System.out.println("min(a, b) = " + Math.min(a, b));    // min(a, b) = -50
        System.out.println("pow(a, c) = " + Math.pow(a, c));    // pow(a, c) = 1000000.0
        System.out.println("random() = " + Math.random());      // random() = 0.5582326484464132
        System.out.println("signum(b) = " + Math.signum(b));    // signum(b) = -1.0
        System.out.println("sqrt(x) = " + Math.sqrt(y));        // sqrt(x) = 1.7320508075688772
    }
}