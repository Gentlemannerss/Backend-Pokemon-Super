package src;

public class Bulbasaur extends Grass {
    private String name;

    public Bulbasaur(String type, double xp, Integer level, double hp, double weight, double height, String name) {
        super(type, xp, level, hp, weight, height);
        this.name = name;
    }

    @Override
    public void speaks() {
        System.out.println("Bulbaa");
    }
    @Override
    public void eats() {
        System.out.println("This Pokemon doesnt eat. It uses foto-synthesis");
    }

    @Override
    public void attacks() {
        System.out.println("This Pokemon can Attack!");
        System.out.println("It knows these moves: ");

        /*System.out.println("Choose between 1,2,3 and 4 wich move to use.");
        Scanner scanner = new Scanner(System.in);*/


    }

    // Getters
    public String getName() {
        return name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
}
