package lesson2_concat_converting_scanner.scanner;

// import javax.swing.JOptionPane;   // This line imports the JOptionPane class.

public class JOptionPane {

    public static void main(String[] args) {

        String s;
        s = javax.swing.JOptionPane.showInputDialog ("Enter an integer:"); // This statement displays an input dialog box with the prompt...
                                                                           //Enter an integer: and assigns the string entered by the user to the variable named s.
        int x = Integer.parseInt(s);                      // This statement uses the parseInt method of the Integer class ...
                                                          // to convert the string entered by the user to an integer.
        System.out.println("You entered " + x + ".");
    }
}
