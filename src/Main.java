package src;

public class Main {
    public static void main(String[] args) {
        /*Bulbasaur b1 = new Bulbasaur(Type.grass, 12000.08, 12, 24, 120, 20, "Bulbasaur");*/
        Charmander c1 = new Charmander("Fire", 11000.2, 11, 22, 60, 40);
        Squirtle s1 = new Squirtle("water", 18000.1, 18, 36, 50, 30, "Squirtle");
        Pikachu p1 = new Pikachu("Electric", 5000, 5, 10, 40, 25, "Pikachu");

        c1.eats();
        System.out.println(c1);

        doubleTypePokemon b2 = new doubleTypePokemon("Bulbasaur", Type.grass, 5000, 5,10, Type.poison, 120, 20, new Stat(110,5,8));
    }
}
