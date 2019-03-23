package lesson3.numbers.expressions.math.number_format;

import java.text.NumberFormat;

public class FormatNumbers {

    public static void main(String[] args) {

        double salesTax = 2.425;
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println(cf.format(salesTax));        // 2,42 €

        double x = 19923.3288;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(3);
        nf.setMaximumFractionDigits(3);
        System.out.println(nf.format(x));               // 19 923,329

        double grade = .92;
        NumberFormat pf = NumberFormat.getPercentInstance();
        System.out.println(pf.format(grade));           // 92%
    }
}

/*
    Method                      Explanation
    getCurrencyInstance()       A static method that returns a NumberFormat object that formats currency values

    getPercentInstance()        A static method that returns a NumberFormat object that formats percentages

    getNumberInstance()         A static method that returns a NumberFormat object that formats basic numbers

    format(number)              Returns a string that contains the formatted number

    setMinimumFraction          Sets the minimum number of digits to display to the right of the decimal point
    Digits(int)

    setMaximumFraction          Sets the maximum number of digits to display to the right of the decimal point
    Digits(int)

*/
