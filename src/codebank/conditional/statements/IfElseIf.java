package codebank.conditional.statements;

public class IfElseIf {

    // Java program to illustrate if-else-if ladder

        public static void main(String args[])
        {
            int i = 20;

            if (i == 10)
                System.out.println("i is 10");
            else if (i == 15)
                System.out.println("i is 15");
            else if (i == 20)
                System.out.println("i is 20");
            else
                System.out.println("i is not present");
        }
    }

    /** Example 2)
     *
     if (firstNumber == secondNumber) {
            System.out.println("Both numbers are the same");
     } else if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " " + secondNumber + " " + "First number is bigger than second");
     } else {
            System.out.println(firstNumber + " " + secondNumber + " " + "Second number is bigger than first");
     }

     */