package lesson2_concat_converting_scanner.scanner;
import java.util.Scanner;
public class ScannerClass {


        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.print("Enter an integer: ");
            int x = sc.nextInt();
            System.out.println("You entered " + x + ".");

        }
    }


/* To read an input value from the user, you can use one of the methods of the Scanner class that are listed

Scanner Class Methods That Get Input Values

boolean     nextBoolean()    Reads a boolean value from the user.
byte        nextByte()       Reads a byte value from the user.
double      nextDouble()     Reads a double value from the user.
float       nextFloat()      Reads a float value from the user.
int         nextInt()        Reads an int value from the user.
String      nextLine()       Reads a String value from the user.
long        nextLong()       Reads a long value from the user.
short       nextShort()      Reads a short value from the user.
 */


/* Scanner Class Methods That Check for Valid Input Values

boolean hasNextBoolean()        Returns true if the next value entered by the user is a valid boolean value.
boolean hasNextByte()           Returns true if the next value entered by the user is a valid byte value.
boolean hasNextDouble()         Returns true if the next value entered by the user is a valid double value.
boolean hasNextFloat()          Returns true if the next value entered by the user is a valid float value.
boolean hasNextInt()            Returns true if the next value entered by the user is a valid int value.
boolean hasNextLong()           Returns true if the next value entered by the user is a valid long value.
boolean hasNextShort()          Returns true if the next value entered by the user is a valid short value.
 */