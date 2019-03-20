package codebank.variable;

import java.util.Scanner;

public class Double {
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
    }
}