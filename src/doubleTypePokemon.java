package src;

public class doubleTypePokemon extends Pokemon {
    private Type additionalType;

    public doubleTypePokemon(String name, Type type, double xp, Integer level, double hp, Type additionalType, double weight, double height, Stat attack) {
        super(name, type, xp, level, hp, weight, height, attack);
        this.additionalType = additionalType;
    }

    @Override
    public void sound() {
        System.out.println("2");
    }

    @Override
    public void eats() {
        System.out.println("0");
    }

    @Override
    public void attacks() {
        System.out.println("1");
    }

    public Type getAdditionalType() {
        return additionalType;
    }

    public void setAdditionalType(Type additionalType) {
        this.additionalType = additionalType;
    }
}
