package lesson2_concat_converting_scanner;
// If you want to convert a double to an int, for example, you must use casting.
//Casting means converting its value from one data type to another

//Casting is similar to conversion but isn’t done automatically.
// You use casting to perform a conversion that is not shown.

// RISK! When you use casting, you run the risk of losing information.
//if you cast a double to an int, so 3.1415 becomes 3, for example.

public class Casting {


    public static void main(String[] args) {

        double pi = 3.1314;

        int iPi;
        iPi = (int) pi;
        System.out.println(iPi);  // prints 3


        double price = 9.99;
        int iPrice = (int) price;
        System.out.println(iPrice);  // prints 9
    }
}

/*  casting int value to double andwer

int a = 21, b = 6;
double answer = (double)a / b;          // answer = 3.5
*/