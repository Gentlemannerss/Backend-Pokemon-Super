package src;

public class Charmander extends Fire {

    public Charmander(String type, double xp, Integer level, double hp, double weight, double height/*, String name*/) {
        super(type, xp, level, hp, weight, height);
        this.name = "Charmander";
    }

    @Override
    public void speaks() {
        System.out.println("Charr charr.");
    }

    @Override
    public void eats() {
        System.out.println("This pokemon eats roaster meat.");
    }

    @Override
    public void attacks() {
        System.out.println("This Pokemon can Attack!");
        System.out.println("It knows these moves: ");

        /*System.out.println("Choose between 1,2,3 and 4 wich move to use.");
        Scanner scanner = new Scanner(System.in);*/


    }

    // Getters


    // Setters

    // ToString
    @Override
    public String toString() {
        return "Name: " + getName() + "Type " + getType() + "Experience " + getXp() + "Level " + getLevel() + "Hitpoints " + getHp() + "Weight" + getWeight() + "Height" + getHeight();
    }
}
