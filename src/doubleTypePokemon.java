package src;

public class doubleTypePokemon extends Pokemon {
    private Type additionalType;

    public doubleTypePokemon(String name, Type type, double xp, Integer level, double hp, Type additionalType, double weight, double height, Stat attack) {
        super(name, type, xp, level, hp, weight, height, attack);
        this.additionalType = additionalType;
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

    public Type getAdditionalType() {
        return additionalType;
    }

    public void setAdditionalType(Type additionalType) {
        this.additionalType = additionalType;
    }
}
