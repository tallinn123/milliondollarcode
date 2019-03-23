package lesson1_convert_class_variables.classes;

public class SecondPublicClass {

    public void sayHello()
    {
        System.out.println("Hello, hello world!");
    }
}

/* 3) The class declaration begins on line 3. The class is declared as public so other classes can use it.
   This declaration is required so that the FirstMainClass class can access the Greeter class.
*
5)  The sayHello method is declared using the public keyword so that it’s available to other classes that
    use the SecondPublicClass class. The void keyword indicates that this method doesn’t provide any
    data back to the class that calls it, and sayHello simply provides the name of the method.
*/