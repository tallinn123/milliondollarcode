package lesson3.numbers.expressions.math;

public class RandomNumbers {  // dice 1-6

    public static void main(String[] args) {

        int low = 1;         // the lowest value in the range
        int high = 6;       // the highest value in the range
        int rnd = (int)(Math.random() * (high - low + 1)) + low;

        System.out.println(rnd);
    }
}
