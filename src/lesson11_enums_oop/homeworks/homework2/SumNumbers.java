package lesson11_enums_oop.homeworks.homework2;

public class SumNumbers {
    public static void main(String[] args) {

        int result = 0;

        for(int firstNumber = 0; firstNumber < 1001; firstNumber++) {
            if (firstNumber == 1001)

                break;
            result = result + firstNumber;

        } System.out.println(result);
    }
}