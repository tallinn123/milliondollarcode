package codebank.loops; // while loop, array, regex, if

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Welcome Stranger.");
        Scanner scanner = new Scanner(System.in);

        while (true) { // continues untl one condtion is true
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

/** 2) Example
 *
 *  while (true) {
 *             System.out.println("Enter the sentence. If you are done write done.");
 *             String name = scanner.nextLine();
 *             String str = name;
 *             String[] arrOfStr = name.split(" " );
 *             if (name.equalsIgnoreCase("done")) {
 *                 break;
 *
 *             }System.out.println(arrOfStr[0]);
 */


/** 3) GeeksForGeeks

 public static void main(String args[]) {

    int x = 1;

    while (x <= 4)  // Exit when x becomes greater than 4
     {

        System.out.println("Value of x:" + x);

        x++;   // Increment the value of x for next iteration
    }
 }
 */