package lesson12_exeptions_generics.exeptions;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.FileReader;

public class ExeptionTest {
    public void handleCheckedExeptionsByTryCatch() { // handling cached exeptions is mandatory. try catch block is required.
        try {
            File file = new File("wrong path"); // path should be like users/raivi/projects/tallinn5
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {    // FileNotFoundExeption should be put here after running
            e.printStackTrace(); // able to see whats is wrong with the console
        }
    }

    public void handleCheckedExeptionByThrowingExeptionFromMethodSignature() throws FileNotFoundException {
        File file = new File("wrong path");
        FileReader fileReader = new FileReader(file);
    }

    public void handleUncheckedExceptionByTryCatch() { // handling unchecked exceptions is not mandatory. try catch block is optional
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)throws Exception{
        ExeptionTest exeptionTest = new ExeptionTest();
        exeptionTest.handleCheckedExeptionsByTryCatch();
        //ExeptionTest.handleCheckedExceptionByThrowingExceptionFromMethodSignature(); // ERROR
        exeptionTest.handleUncheckedExceptionByTryCatch();
    }
}


