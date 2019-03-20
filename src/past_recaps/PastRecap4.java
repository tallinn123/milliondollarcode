package past_recaps; // if else condition inside another if else

import java.util.Scanner;

public class PastRecap4 {
    public static void main(String[] args) {

        System.out.println(" Welcome stranger. Please enter password");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        if (input.equals("password")) {
            System.out.println("Please enter the second password");
            input = scanner.nextLine();
            if (input.equals("password1")) {
                System.out.println("Welcome to the club");
            }else{
                System.out.println("Second password is wrong"); }
        } else {
            System.out.println("wrong password");
        }
    }
}
