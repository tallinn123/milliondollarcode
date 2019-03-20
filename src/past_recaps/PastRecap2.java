package past_recaps; // if-else if- else

import java.util.Scanner;

public class PastRecap2 {

    public static void main(String[] args) {
        System.out.println("Welcome Stranger. Please enter a number ");

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        int firstNumber = input.nextInt();
        System.out.println("Welcome Stranger. Please enter one more number");
        int secondNumber = input2.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Both numbers are the same");
        } else if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " " + secondNumber + " " + "First number is bigger than second");
        } else {
            System.out.println(firstNumber + " " + secondNumber + " " + "Second number is bigger than first");
        }

    }
}