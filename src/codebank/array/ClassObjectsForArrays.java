package codebank.array;

public class ClassObjectsForArrays {

    // Java program to demonstrate
// Class Objects for Arrays

        public static void main(String args[])
        {
            int intArray[] = new int[3];
            byte byteArray[] = new byte[3];
            short shortsArray[] = new short[3];

            // array of Strings
            String[] strArray = new String[3];

            System.out.println(intArray.getClass());
            System.out.println(intArray.getClass().getSuperclass());
            System.out.println(byteArray.getClass());
            System.out.println(shortsArray.getClass());
            System.out.println(strArray.getClass());
        }
    }

    /**
     * Explanantion :
     *
     * The string “[I” is the run-time type signature for the class object “array with component type int“.
     * The only direct superclass of any array type is java.lang.Object.
     * The string “[B” is the run-time type signature for the class object “array with component type byte“.
     * The string “[S” is the run-time type signature for the class object “array with component type short“.
     * The string “[L” is the run-time type signature for the class object “array with component type of a Class”. The Class name is then followed.
     * */