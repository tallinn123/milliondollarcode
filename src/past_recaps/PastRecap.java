package past_recaps;  // if-else

import java.util.Scanner;

public class PastRecap {

    public static void main(String[] args) {
        System.out.println(" Welcome stranger. Please enter your full name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("James Bond")){   // IgboreCase means letters can be small & capital, doesnn't mattes
            System.out.println("Welcome 007 ");
        }else{
            System.out.println("You are not an agent. Get Out!");
        }
    }

}