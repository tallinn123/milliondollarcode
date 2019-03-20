package past_recaps;

import java.util.Scanner;

public class PastRecap12DogMain {

        public static void main(String[] args) {
            System.out.println("Welcome stranger.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your dog name");
            String dogName = scanner.nextLine();

            String dogAge;
            while(true){
                System.out.println("Enter your dog age");
                dogAge = scanner.nextLine();
                if(Integer.parseInt(dogAge)<0){
                    System.out.println("Dog age cannot be negative");
                }else{
                    break;
                }
            }

            String dogSpecies="";
            while(true){
                System.out.println("Enter your dog species");
                dogSpecies = scanner.nextLine();
                if(!dogSpecies.equalsIgnoreCase("Chihuahua") &&
                        !dogSpecies.equalsIgnoreCase("Husky") &&
                        !dogSpecies.equalsIgnoreCase("Beagle") ){
                    System.out.println("It is not Chihuahua or Husky or Beagle..");
                }else{
                    break;
                }
            }

            PastRecap12Dog dog = new PastRecap12Dog(dogName,Integer.parseInt(dogAge),dogSpecies);
            dog.print();
            dog.ageDecision();
        }
    }
