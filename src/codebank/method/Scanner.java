package codebank.method;

// import java.util.Scanner;

public class Scanner {

    public static void main(String[] args) {
        System.out.println("Enter your full name");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("James Bond")){   // IgboreCase means letters can be small & capital, doesnn't mattes
            System.out.println("Welcome 007 ");
        }else{
            System.out.println("You are not an agent. Get Out!");
        }
    }
}


/** example 2)
 *         Scanner input = new Scanner(System.in);
 *         Scanner input2 = new Scanner(System.in);
 *
 *         int firstNumber = input.nextInt();
 *         System.out.println("Welcome Stranger. Please enter one more number");
 *         int secondNumber = input2.nextInt();
 *
 */

/** example 3)
 *          Scanner scanner = new Scanner(System.in);
 *
 *                   System.out.println("Write number 1");
 *         double input1 = scanner.nextDouble();
 *
 *                    System.out.println("Write number 2");
 *         double input2 = scanner.nextDouble();
 * */
