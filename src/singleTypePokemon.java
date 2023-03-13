package src;

public class singleTypePokemon extends Pokemon {
    public singleTypePokemon(String name, Type type, double xp, Integer level, double hp, double weight, double height, Stat attack) {
        super(name, type, xp, level, hp, weight, height, attack);
    }

    @Override
    public void sound() {
        System.out.println("The Pokemon makes a sound");
    }

    @Override
    public void eats() {
        System.out.println("The Pokemon is eating a berry");
    }

    @Override
    public void attacks() {
        System.out.println("The Pokmeon Attacks");
    }
}
