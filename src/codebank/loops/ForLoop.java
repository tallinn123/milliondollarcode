package codebank.loops;

public class ForLoop {
    // Java program to illustrate using
// break to exit a loop

        public static void main(String args[])
        {
            // Initially loop is set to run from 0-9

            for (int i = 0; i < 10; i++)
            {
                // terminate loop when i is 5.
                if (i == 5)
                    break;

                System.out.println("i: " + i);
            }
            System.out.println("Loop complete.");
        }
    }

/**
 * i: 0
 * i: 1
 * i: 2
 * i: 3
 * i: 4
 * Loop complete.
 *
 * Process finished with exit code 0
 */



/** Example 2 (PastRecap7)
 *
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

 */

   /** Example 3.
    *
    * for (int counter = 0; counter < items.length; counter++) {
        if (items[counter].equalsIgnoreCase(itemSearched)) {
        System.out.println("Item located at index " + counter);
        found = true;
        }
        }
*/

   /** GeeksForGeeks example

    public static void main(String args[])
    {
            // for loop begins when x=2 and runs till x <=4

        for (int x = 2; x <= 4; x++)
            System.out.println("Value of x:" + x);
    }

    */