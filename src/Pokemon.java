package src;

public abstract class Pokemon {
    public String name;
    private String type;
    private double xp;
    private Integer level;
    private double hp;

    // Constructor
    public Pokemon (String type, double xp, Integer level, double hp){
        this.type = type;
        this.xp = xp;
        this.level = level;
        this.hp = hp;
    }

    // Methods
    public abstract void eats();
    public abstract void attacks();

    // Getters
    public double getXp() {
        return xp;
    }
    public double getHp() {
        return hp;
    }
    public String getType() {
        return type;
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
    public void setType(String type) {
        this.type = type;
    }
    public void setXp(double xp) {
        this.xp = xp;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }
}
