package codebank.method;

// import java.util.Scanner;

public class Scanner {

    public static void main(String[] args) {
        System.out.println("Enter your full name");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("James Bond")){   // IgboreCase means letters can be small & capital, doesnn't mattes
            System.out.println("Welcome 007 ");
        }else{
            System.out.println("You are not an agent. Get Out!");
        }
    }
}


/** example 2)
 *         Scanner input = new Scanner(System.in);
 *         Scanner input2 = new Scanner(System.in);
 *
 *         int firstNumber = input.nextInt();
 *         System.out.println("Welcome Stranger. Please enter one more number");
 *         int secondNumber = input2.nextInt();
 *
 */

/** example 3)
 *          Scanner scanner = new Scanner(System.in);
 *
 *                   System.out.println("Write number 1");
 *         double input1 = scanner.nextDouble();
 *
 *                    System.out.println("Write number 2");
 *         double input2 = scanner.nextDouble();
 * */

/*
boolean     nextBoolean()    Reads a boolean value from the user.
byte        nextByte()       Reads a byte value from the user.
double      nextDouble()     Reads a double value from the user.
float       nextFloat()      Reads a float value from the user.
int         nextInt()        Reads an int value from the user.
String      nextLine()       Reads a String value from the user.
long        nextLong()       Reads a long value from the user.
short       nextShort()      Reads a short value from the user.
 */

// Scanner Class Methods That Check for Valid Input Values

/*
boolean hasNextBoolean()        Returns true if the next value entered by the user is a valid boolean value.
boolean hasNextByte()           Returns true if the next value entered by the user is a valid byte value.
boolean hasNextDouble()         Returns true if the next value entered by the user is a valid double value.
boolean hasNextFloat()          Returns true if the next value entered by the user is a valid float value.
boolean hasNextInt()            Returns true if the next value entered by the user is a valid int value.
boolean hasNextLong()           Returns true if the next value entered by the user is a valid long value.
boolean hasNextShort()          Returns true if the next value entered by the user is a valid short value.
 */
