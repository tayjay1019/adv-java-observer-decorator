package decorator.adventuregame;

public class DecoratorDemo {

    public static void main(String[] args) {
        GameCharacter basicCharacter = new Spear(new Sword(new BasicCharacter("Bilbo")));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Might: " + basicCharacter.getMight());
    }
}
