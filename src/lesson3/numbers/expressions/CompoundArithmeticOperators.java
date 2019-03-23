package lesson3.numbers.expressions;

public class CompoundArithmeticOperators {

    //   Operator Description

    /*
    += Addition and assignment
    -= Subtraction and assignment
    *= Multiplication and assignment
    /= Division and assignment
    %= Remainder and assignment}
    */
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;

        a += 10; /*is equivalent to*/ a = a + 10;
        System.out.println(a);

        b *= 2; /*is equivalent to*/ b = b * 2;
        System.out.println(b);

        c *= b + 1; /*is equivalent to*/ c = c * (b + 1);
        System.out.println(c);

        d %= b+1; /*is equivalent to */  d = d% (b+1);
        System.out.println(a);
    }
}