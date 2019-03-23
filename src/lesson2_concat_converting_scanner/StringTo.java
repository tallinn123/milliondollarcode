// Converting String to primitives (int,short,long...)

// you can write programs that let theuser
// enter numeric data via the console window.

// To convert a String to a primitive type, we use a parse method
package lesson2_concat_converting_scanner;

public class StringTo {

    public static void main(String[] args) {

        String s = "10";
        int x = Integer.parseInt(s);

        System.out.println("int " + x);
    }
}
 /*
 Wrapper        Merhod                      Example

 Integer    parseInt(String)            int x = Integer.parseInt("100");

 Short      parseShort(String)          short x = Short.parseShort("100");

 Long       parseLong(String)           long x = Long.parseLong("100");

 Byte       parseByte(String)           byte x = Byte.parseByte("100");

 Float      parseByte(String)           float x = Float.parseFloat("19.95");

Double      parseByte(String)           double x = Double.parseDouble("19.95");

Character   (none)                      -

Boolean     parseBoolean                boolean x = Boolean.parseBoolean

(String)    ("true");                   -
 */