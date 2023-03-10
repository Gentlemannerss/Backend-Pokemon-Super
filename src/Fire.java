package src;

public abstract class Fire extends Pokemon {
    public double weight;
    public double height;

    public Fire(String type, double xp, Integer level, double hp, double weight, double height) {
        super(type, xp, level, hp);
        this.weight = weight;
        this.height = height;
    }

    public abstract void speaks();

    // Getters & Setters


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
