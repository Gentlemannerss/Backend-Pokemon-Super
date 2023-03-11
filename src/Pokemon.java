package src;

public abstract class Pokemon {
    public String name;
    private Type baseType;
    private double xp;
    private Integer level;
    private double hp;
    public double weight;
    public double height;
    private Stat attack;

    // Constructor
    public Pokemon (String name, Type type, double xp, Integer level, double hp, double weight, double height, Stat attack){
        this.name = name;
        this.baseType = type;
        this.xp = xp;
        this.level = level;
        this.hp = hp;
        this.weight = weight;
        this.height = height;
        this.attack = attack;
    }

    // Methods
    public abstract void eats();
    public abstract void attacks();
    public abstract void sound();

    // Getters
    public double getXp() {
        return xp;
    }
    public double getHp() {
        return hp;
    }
    public Type getType() {
        return baseType;
    }
    public Integer getLevel() {
        return level;
    }
    public String getName() {
        return name;
    }

    // Setters
    public void setHp(double hp) {
        this.hp = hp;
    }
    public void setType(Type type) {
        this.baseType = type;
    }
    public void setXp(double xp) {
        this.xp = xp;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }
}
