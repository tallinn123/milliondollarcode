package lesson10_harry_potter;

import java.util.Scanner;

    public class WizardWars {

        public static void main(String[] args) {
            CharacterCreation characterCreation = new CharacterCreation();
            System.out.println("Welcome to Wizard Wars. Lets create our character");
            Wizard player = new Wizard();
            Scanner scanner = new Scanner(System.in);


            while (player.getName() == null || player.getName().isEmpty()) {
                System.out.println("Please enter your characters' first name");
                String incomingfirstName = scanner.nextLine();
                if (characterCreation.validateName(incomingfirstName)) {
                    player.setName(incomingfirstName);
                }
            }
            while (player.getSurname() == null || player.getSurname().isEmpty()) {
                System.out.println("Please enter your characters' surname");
                String incomingSurname = scanner.nextLine();
                if (characterCreation.validateSurname(incomingSurname)) {
                    player.setSurname(incomingSurname);
                }
            }
            System.out.println("So " + player.getName() + " " + player.getSurname() + " " + "Are you ready to play!");


            WizardShop wizardShop = new WizardShop();

            while(true){
                System.out.println("Can I take Your order? What do you want to buy. If you are dome write done");
                wizardShop.printAllSpells();
                String buyingSpell = scanner.nextLine();
                if(buyingSpell.equalsIgnoreCase("done")){
                    break;
                }
                wizardShop.buy(buyingSpell,player);
            }
            System.out.println();





                /** while loop // buying operation
                 done will wxit
                 printout all the spells he knows */


            }
        }




