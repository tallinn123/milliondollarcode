// Converting primitives (int, short, long...) to String

package lesson2_concat_converting_scanner;

// Java automatically converts primitive values to string
// values whenever you use a primitive value in a concatenation.


// Convert a primitive value to a String by using the toString method!

// To convert the int variable x to a string, for example, you use this statement:

public class ToString {
    public static void main(String[] args) {

        int x = 10;
        String s = Integer.toString(x);

        System.out.println( "String " + s);
    }
}
