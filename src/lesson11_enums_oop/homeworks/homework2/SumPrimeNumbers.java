package lesson11_enums_oop.homeworks.homework2;

public class SumPrimeNumbers {

    public boolean isPrime(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        SumPrimeNumbers sumUpOfPrimeNumbers = new SumPrimeNumbers();

        int result = 0;
        for (int i = 1; i<= 1000; i++){
            if (sumUpOfPrimeNumbers.isPrime(i)){
                result += i; // result = result + i;
            }
        }

        System.out.println(result);
    }
}