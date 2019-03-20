// scanner method, while loop condition, if-else condition, for loop condition,

package past_recaps;

import java.util.Scanner;

public class PastRecap7 {
    public static void main(String[] args) {
        System.out.println("Welcome Stranger.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the sentence. If you are done write done.");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Which order for the sentence you want to print");
                String numberofword = scanner.nextLine();
                /**int option = input.nextInt();
                 * input.nextLine();
                 */
                if (Integer.parseInt(numberofword) <= 0) {
                    System.out.println("Cannot accept 0 or negative number");
                } else {
                    String[] splittedwords = input.split(" ");

                    int counter = 1;
                    boolean found = false;

                    for (String word : splittedwords) {
                        if (!word.isEmpty() && !word.equalsIgnoreCase(" ")) {
                            if (counter == Integer.parseInt(numberofword)) {
                                System.out.println("Result word: " + word);
                                found = true;
                                break;
                            } else {
                                counter++;
                            }
                        }
                    }
                    if (!found) ;
                    {
                        System.out.printf("We cannot find the word. Sentence is too short.");

                    }
                }
            }
        }
    }
}


