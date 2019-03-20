package lesson8.list;


import java.util.Arrays;
import java.util.Stack;

public class StackOfCards {

    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack <>() ;

        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println(stackOfCards);
        // Jack, Queen, Ace, King

        int [] s = new  int[7];
        System.out.println(s.toString());
        System.out.println(Arrays.toString(s));

        String theLastInfo = stackOfCards.pop();
        System.out.println(theLastInfo);
    }
}
