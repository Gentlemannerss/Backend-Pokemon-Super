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

    public Type getBaseType() {
        return baseType;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public Stat getAttack() {
        return attack;
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
    public void setName(String name) {
        this.name = name;
    }
    public void setBaseType(Type baseType) {
        this.baseType = baseType;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setAttack(Stat attack) {
        this.attack = attack;
    }
}
