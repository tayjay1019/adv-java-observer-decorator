package decorator.adventuregame;

import java.util.Scanner;

public class DecoratorDemo {

    public static void main(String[] args) {
        /*GameCharacter basicCharacter = new Spear(new Sword(new BasicCharacter("Bilbo")));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Might: " + basicCharacter.getMight());*/
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Name your Character:\n>");
        String name = keyboard.nextLine();
        GameCharacter testCharacter = new BasicCharacter(name);
        System.out.println("Hello " + testCharacter.getName());
        System.out.println("Do you choose a sword and shield, or the great sword?");
        System.out.println("1. Sword and Shield");
        System.out.println("2. Great Sword\n>");
        String choice = keyboard.nextLine();

        if(choice.equals("1")){
            testCharacter = new Shield(new Sword(new BasicCharacter(name)));
        }
        else {
            testCharacter = new GreatSword(new BasicCharacter(name));
        }

        System.out.println("Very well, " + testCharacter.getName());

        System.out.println("What else will you bring?\n1. Spear\n2. Food\n>");
        choice = keyboard.nextLine();

        if (choice.equals("1")) {
            testCharacter = new Starving(new Spear(testCharacter));
        }
        System.out.println("Understood");
        System.out.println("A Wild foe appears!");

        GameCharacter foe = new Shield(new Sword(new BasicCharacter("Foe")));
        System.out.println("Your might is: " + testCharacter.getMight());
        System.out.println("Your foe's might is: " + foe.getMight());

        if(testCharacter.getMight() == foe.getMight())
        {
            System.out.println("It seems you are evenly matched!\nYou both go home\nBetter luck next time " + testCharacter.getName());
        }
       else if (testCharacter.getMight() > foe.getMight()) {
            System.out.println("You have won the battle!\n" + testCharacter.getName());
        }
        else {
            System.out.println("You have been slain!\n" + testCharacter.getName());
        }




    }
}
