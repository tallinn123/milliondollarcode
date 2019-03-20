package past_recaps;
import java.util.Scanner;
public class PastRecap13 {

        public static void main(String[] args) {
            System.out.println("Welcome stranger.");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Which word you want to encrypt");
            String encryptedWords = scanner.nextLine();

            System.out.println("Which word you want to change the word to.");
            String wordToPrint = scanner.nextLine();


            System.out.println("What is the sentence");
            String sentence = scanner.nextLine();

            System.out.println(sentence);
            sentence = sentence.replaceAll("(?i)" + encryptedWords, wordToPrint);
            System.out.println(sentence);
        }
    }