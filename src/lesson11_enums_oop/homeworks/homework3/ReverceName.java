package lesson11_enums_oop.homeworks.homework3;

// import java.util.Scanner;

public class ReverceName {

    public String getReverseEasily(String name) {
        return new StringBuilder(name).reverse().toString();
    }

    public String getReverse(String name) {

        String reverseName = "";
        for (int i = name.length() - 1; i > 0; i--) {
            reverseName = reverseName + name.charAt(i);
        }
        return reverseName;
    }

    public static void main(String[] args) {
        ReverceName reverceName = new ReverceName();

        System.out.println("Easy way result: " + reverceName.getReverseEasily("Raivi"));
        System.out.println("Normal way result: " + reverceName.getReverse("Raivi"));
    }
}

 /** My way was
  System.out.println("Enter name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        char[] charArrays = name.toCharArray(); //Muudame sisendi sõnad tähtedeks(karakteriteks) ja lülideks(array)
        for (int counter = 0; counter < charArrays.length; counter++) {
            System.out.print(charArrays[counter]);
        }
    */