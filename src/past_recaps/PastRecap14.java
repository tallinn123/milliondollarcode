package past_recaps;
import java.util.Scanner;
public class PastRecap14 {

        public static void main(String[] args) {
            System.out.println("Welcome stranger.");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.matches("^([+-]?\\d*\\.?\\d*)$")) {
                System.out.println("It is number");
            } else {
                System.out.println("It is not number");
            }
        }
    }

