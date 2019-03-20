// while loop, array, regex, if

package past_recaps;

import java.util.Scanner;

public class PastRecap6 {
    public static void main(String[] args) {
        System.out.println("Welcome Stranger.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the sentence. If you are done write done.");
            String name = scanner.nextLine();

            String str = name;

            String[] arrOfStr = name.split(" " );

            if (name.equalsIgnoreCase("done")) {
                break;

            }System.out.println(arrOfStr[0]);
        }

    }
}