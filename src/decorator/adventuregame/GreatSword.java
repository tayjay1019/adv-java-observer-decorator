package decorator.adventuregame;

public class GreatSword extends CharacterDecorator{

    public GreatSword(GameCharacter character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Heavy Weapon Master";
    }

    @Override
    public double getMight() {
        return character.getMight() + 20;
    }
}

