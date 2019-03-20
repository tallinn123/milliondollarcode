package past_recaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PastRecap17DogOperations {

        public static void main(String[] args) {
            System.out.println("Welcome to Dog Administration.");
            Scanner scanner = new Scanner(System.in);
            List<PastRecap17Dog> listOfDogs = new ArrayList<>();

            while (true) {
                System.out.println("What do you want to do ? Add/Search/View/Done");
                String command = scanner.nextLine();

                if (command.equalsIgnoreCase("Done")) {
                    break;
                } else if (command.equalsIgnoreCase("Add")) {
                    System.out.println("Enter dog name");
                    String dogName = scanner.nextLine();
                    System.out.println("Enter dog age");
                    Integer dogAge = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter dog species");
                    String dogSpecies = scanner.nextLine();

                    PastRecap17Dog dog = new PastRecap17Dog(dogName,dogAge,dogSpecies);
                    System.out.println("Dog is entered.");
                    dog.print();
                    listOfDogs.add(dog);

                } else if (command.equalsIgnoreCase("Search")) {
                    System.out.println("Enter dog name");
                    String dogName = scanner.nextLine();

                    boolean found=false;
                    for (PastRecap17Dog dog:listOfDogs){
                        if(dog.getName().equalsIgnoreCase(dogName)){
                            if(!found){
                                System.out.println("System found the dog.");
                                found=true;
                            }
                            dog.print();
                        }
                    }

                    if(!found){
                        System.out.println(dogName + " does not exist.");
                    }

                } else if (command.equalsIgnoreCase("View")) {
                    System.out.println("Printing all dogs.");
                    for (PastRecap17Dog dog:listOfDogs){
                        dog.print();
                    }
                }else {
                    System.out.println("Invalid command");
                }
            }
        }
    }