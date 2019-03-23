package lesson3.numbers.expressions.math;

public class Numbers {

    public static void main(String[] args) {
        int a = 32, b = 5;
        int c = a + b; // c is 37
        int d = a - b; // d is 27
        int e = a * b; // e is 160
        int f = a / b; // f is 5 (32 / 5 is 6 remainder 2)
        int g = a % b; // g is 2 (32 / 5 is 6 remainder 2)
        a++; // a is now 33
        b--; // b is now 4

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
