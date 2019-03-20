package lesson8.list;

import java.util.ArrayList;
import java.util.List;

public class PersonHomework {

    public static void main(String[] args) {
        //  crating an arrayList. It will consist Persons
        List<Person> personList = new ArrayList<>();

        Person Person1 = new Person(15,"Kalle");
        Person Person2 = new Person(20,"Malle");
        Person Person3 = new Person(30,"Mari");
        Person Person4 = new Person(35,"Raivo");
        Person Person5 = new Person(40,"Peeter");

        personList.add(Person1);
        personList.add(Person2);
        personList.add(Person3);
        personList.add(Person4);
        personList.add(Person5);

        Person firstPerson = personList.get(0);
        System.out.println(firstPerson.getName()+" "+ firstPerson.getAge());

        for (Person someone:personList) {
            System.out.println(someone.getName()+" "+someone.getAge());
        }
        /*  Same way to print out
        for(int counter=0; counter<personList.size();counter++) {
            System.out.println(personList.get(counter).getName()+" "+personList.get(counter).getAge());
         */
        }
    }
