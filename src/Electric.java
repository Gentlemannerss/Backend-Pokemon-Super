package src;

public abstract class Electric extends Pokemon {
    public double weight;
    public double height;

    public Electric(String type, double xp, Integer level, double hp, double weight, double height) {
        super(type, xp, level, hp);
        this.weight = weight;
        this.height = height;
    }

    public abstract void speaks();

    // Getters
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }

    // Setters
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
