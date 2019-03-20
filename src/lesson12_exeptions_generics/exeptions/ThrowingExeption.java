package lesson12_exeptions_generics.exeptions;

public class ThrowingExeption {
    public void throwExeptionExample(){
        try {
            int a = 5 / 0;
        }catch (ArithmeticException e){
            // Throwing exception is mostly used for giving information to developer for maintanance the code
            throw new ArithmeticException("You are probably dividing a number bu 0(zero)");
        }
    }

    public static void main(String[] args) {
        ThrowingExeption throwingExeption = new ThrowingExeption();

        throwingExeption.throwExeptionExample();
    }
}
