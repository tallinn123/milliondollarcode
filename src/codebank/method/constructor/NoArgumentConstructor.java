package codebank.method.constructor;

public class NoArgumentConstructor {

    // Java Program to illustrate calling a no-argument constructor

        int num;
        String name;

        // this would be invoked while object of that class created.
        {
            System.out.println("Constructor called");
        }


        public static void main (String[] args)
        {
            // this would invoke default constructor.
            NoArgumentConstructor geek1 = new NoArgumentConstructor();

            // Default constructor provides the default values to the object like 0, null
            System.out.println(geek1.name);
            System.out.println(geek1.num);
        }
    }

