package lesson3.numbers.expressions;

import java.util.Scanner;

public class Marbles {

    static Scanner sc = new Scanner(System.in); // Creates the Scanner object and assigns it to a class variable
                                                //...so that it can be used in any method in the class.


    public static void main(String[] args) {

// declarations
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;

// get the input data                                                           // Get the input from the user.
        System.out.println("Welcome to the marble divvy-upper.");
        System.out.print("Number of marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.print("Number of children: ");
        numberOfChildren = sc.nextInt();

// calculate the results
        marblesPerChild = numberOfMarbles / numberOfChildren;
        marblesLeftOver = numberOfMarbles % numberOfChildren;

// print the results
        System.out.println("Give each child " + marblesPerChild + " marbles.");
        System.out.println("You will have " + marblesLeftOver + " marbles left over.");

    }
}
