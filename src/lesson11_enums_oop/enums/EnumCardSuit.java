package lesson11_enums_oop.enums;

// Using enum to Create Your Own Data Types
// Enums are used to standardize some values

/*enum is basically a custom variable type
which has a limited set of possible values.
To define an enum, you use the enum keyword
(usually modified by public) followed by a list of possible
values enclosed in brackets:
* */

public class EnumCardSuit {

    public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS}

    public static void main(String[] args)
    {
        CardSuit suit; // You can declare variables using the enum’s name as the data type
        suit = CardSuit.HEARTS; // Then, you can assign a value by using the enum name followed
                                // by a period and any of the enum values.
        System.out.println("The suit is " + suit);
    }
}
