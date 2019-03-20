package codebank.method.constructor;

public class ParameterizedConstructor {

    // Java Program to illustrate calling of parameterized constructor.

        // data members of the class.
        String name;
        int id;

        // contructor would initialized data members with the values of passed arguments while object of that class created.

        ParameterizedConstructor(String name, int id)
        {
            this.name = name;
            this.id = id;
        }

        public static void main (String[] args)
        {
            // this would invoke parameterized constructor.
            ParameterizedConstructor geek1 = new ParameterizedConstructor("adam", 1);
            System.out.println("GeekName :" + geek1.name +
                    " and GeekId :" + geek1.id);
        }
    }
