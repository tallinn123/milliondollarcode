package codebank.array;

import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {

        System.out.println("Welcome stranger. Please Enter String"); //Selgitame mida on vaja sisestada
        Scanner scanner = new Scanner(System.in); // defineerime scanner meetodi ja loome, et järgmine sisent on sisend
        String input = scanner.nextLine(); // String tüüpi sisend = scanneri järgmine rida

        char[]charArrays = input.toCharArray(); //Muudame sisendi sõnad tähtedeks(karakteriteks) ja lülideks(array)
        for(int counter=0; counter<charArrays.length; counter++){
            System.out.print(charArrays[counter]+" ");
        }
    }
}
