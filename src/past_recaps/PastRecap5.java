// Factorial 1*2*3*4*5*6*7*8*9*..., while loop, if else,

package past_recaps;

import java.util.Scanner;

public class PastRecap5 {

    public static void main(String[] args) {
        System.out.println("Welcome Stranger.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a number for factorial. -1 is special command to exit");
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            } else if (input < 0) {
                System.out.println("This is a negative number. Not acceptable.");
            } else if (input == 0) {
                System.out.println("Result : 1");
            } else {
                int result = 1;
                for (int counter = input; counter > 1; counter--) {
                    result = result * counter;
                }
                System.out.println("Result " + result);
            }
        }
    }
}

