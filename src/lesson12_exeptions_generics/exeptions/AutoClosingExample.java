package lesson12_exeptions_generics.exeptions;

import java.util.Scanner;

public class AutoClosingExample {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){ // Scanner will be closed in any case
            int a = 5/0;
            int b = scanner.nextInt();
        }
    }
}
