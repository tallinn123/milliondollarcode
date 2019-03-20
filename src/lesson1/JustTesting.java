package lesson1;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class JustTesting {

    static int simpleArraySum(int[] ar) {


        static int arr[] = {12, 3, 4, 15};

        {
            int sum = 0; // initialize sum
            int i;

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main (String[]args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int arCount = Integer.parseInt(scanner.nextLine().trim());

            int[] ar = new int[arCount];

            String[] arItems = scanner.nextLine().split(" ");

            for (int arItr = 0; arItr < arCount; arItr++) {
                int arItem = Integer.parseInt(arItems[arItr].trim());
                ar[arItr] = arItem;
            }

            int result = simpleArraySum(ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();
        }
    }
}
