package lesson8.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> listOfAnimals = new ArrayList<>();

        listOfAnimals.add("dog");
        listOfAnimals.add("cat");
        listOfAnimals.add("tiger");
        listOfAnimals.add("bear");
        listOfAnimals.add("monkey");

        if(listOfAnimals.contains("donkey")){ // if containd donkey then comes here
            System.out.println("Why donkey is here");
        }

        listOfAnimals.add("eagle");
        System.out.println(listOfAnimals);

        List <String> newAnimalList = new ArrayList<>();
        newAnimalList.addAll(listOfAnimals);
        System.out.println(newAnimalList);

        List<String> newList;
        newList=listOfAnimals;
        System.out.println(newList);

        listOfAnimals.remove(0);
        System.out.println(newList);
        newList.remove(0);
        System.out.println(listOfAnimals);

    }

}
