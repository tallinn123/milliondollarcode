package codebank.conditional.statements;

import java.util.Scanner;

public class IfElse {

    /** 1)

     int i = 10;

     if (i < 15)
     System.out.println("i is smaller than 15");
     else
     System.out.println("i is greater than 15");
     }
     }
     */


    // 2)
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
// 3)

/**
 if  (name.equalsIgnoreCase("James Bond")){   // IgnoreCase means letters can be small & capital, does not matter
    System.out.println("Welcome 007 ");
 }else{
    System.out.println("You are not an agent. Get Out!");
 }
 */