package lesson11_enums_oop.oop.polymorphism;

public class PolymorphismTest {

    public static void main(String[] args) {

        SuperClass superClass1 = new SuperClass(); // / SuperClass1 is instance of only SuperClass
        System.out.println(superClass1.getBar());

        SuperClass superClass2 = new SubClass1(); // Polymorphism is here //  SubClass2 is instance of Subclass1 and SuperClass
        System.out.println(superClass2.getBar());

        SubClass1 subClass1 = new SubClass1();// SubClass1 is instance of SubClass1 and SuperClass
        System.out.println(subClass1.getBar());

        if (superClass2 instanceof SuperClass) {
            System.out.println("I am a super class");
        }
        if (superClass2 instanceof SubClass1){
                System.out.println("I am sub class");
        }
    }
}