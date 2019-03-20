package past_recaps;

import java.util.Scanner;

public class PastRecap8 {
    public static void main(String[] args) {
        System.out.println("Welcome stranger");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write number 1");
        double input1 = scanner.nextDouble();

        System.out.println("Write number 2");
        double input2 = scanner.nextDouble();

        double output3 = input1 * input2;
        double threshold = .0001;

        if (output3 < 1000) {
            System.out.println("below 1000");
        }

       // if  (Math.abs(result - 1000) < threshold  || result>1000)
       // &&  (Math.abs(result - 2000) < threshold  || result<2000)


        if (output3 > 1000 && output3 <= 2000){
        System.out.println("between 1000-2000 (included)");
        }
        if (output3 > 2000) {
            System.out.println("above 2000");
        }
    }
}
