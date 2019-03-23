package lesson1_convert_class_variables.variables;
//A shadowed variable is a variable that would otherwise be accessible
// but is temporarily made unavailable because a variable with the same name
// has been declared in a more immediate scope.

// a class variable named x is declared.
// Then, in the main method, a local variable with the same name is declared.

public class ShadowingVariables {

    static int x;                                                       // The class variable x is declared

    public static void main(String[] args) {
        x = 5;                                                          // The class variable x is assigned a value of 5
        System.out.println("x = " + x);
        int x;                                                          // a local variable named x is declared
                                        // The local variable shadows the class variable x, so any reference to x through the
                                        //end of this method refers to the local variable rather than the class variable.
        x = 10;
        System.out.println("x = " + x);
        System.out.print("ShadowApp.x = " + ShadowingVariables.x);
    }
}


// RISK
//Because shadowing is a common source of errors, I suggest that you avoid it as much as possible.