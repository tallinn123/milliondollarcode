package codebank.conditional.statements;

public class If {

    // Here if the condition is true, if block
// will consider only statement1 to be inside
// its block.
// Java program to illustrate If statement

        public static void main(String args[]) {
            int i = 10;

            if (i > 15)
                System.out.println("10 is less than 15");

            // This statement will be executed
            // as if considers one statement by default
            System.out.println("I am Not in if");
        }
    }


