package decorator.adventuregame;

public class Starving extends CharacterDecorator {
    public Starving(GameCharacter character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", The Starved";
    }

    @Override
    public double getMight() {
        return character.getMight() - 10;
    }
}
