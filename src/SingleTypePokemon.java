package src;

public class SingleTypePokemon extends Pokemon {
    public SingleTypePokemon(String name, Type type, double xp, Integer level, double hp, double weight, double height, Stat attack) {
        super(name, type, xp, level, hp, weight, height, attack);
    }

    @Override
    public void sound() {
        System.out.println("The Pokemon makes a single sound");
    }

    @Override
    public void eats() {
        System.out.println("The Pokemon is eating only berry's of it's type.");
    }

    @Override
    public void attacks() {
        System.out.println("The Pokmeon Attacks with a singe type");
    }
}
