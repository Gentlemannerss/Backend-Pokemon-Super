package src;

public class DoubleTypePokemon extends Pokemon {
    private Type additionalType;

    public DoubleTypePokemon(String name, Type type, double xp, Integer level, double hp, Type additionalType, double weight, double height, Stat attack) {
        super(name, type, xp, level, hp, weight, height, attack);
        this.additionalType = additionalType;
    }

    @Override
    public void sound() {
        System.out.println("The Pokemon makes a cry");
    }

    @Override
    public void eats() {
        System.out.println("The Pokemon is happy eating two different type's of berry");
    }

    @Override
    public void attacks() {
        System.out.println("The Pokmeon Attacks with two types.");
    }

    public Type getAdditionalType() {
        return additionalType;
    }

    public void setAdditionalType(Type additionalType) {
        this.additionalType = additionalType;
    }
}
