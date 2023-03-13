package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        doubleTypePokemon b2 = new doubleTypePokemon("Bulbasaur", Type.Grass, 5000, 5,10, Type.Poison, 120, 20, new Stat(110,5,8));
        singleTypePokemon c1 = new singleTypePokemon("Charmander", Type.Fire, 1100.2,11, 22, 60, 40, new Stat(110,5,13));
        singleTypePokemon p1 = new singleTypePokemon("Pikachu", Type.Electric,5000,5,10,40,25, new Stat(110,5,7));
        singleTypePokemon s1 = new singleTypePokemon("Squirtle", Type.Water, 14000.5, 14, 28, 64, 35, new Stat(110,5,20));
        c1.eats();
        System.out.println(c1);

        ArrayList<Pokemon> battleParty = new ArrayList<>();
        battleParty.add(b2);
        battleParty.add(c1);
        battleParty.add(p1);
        battleParty.add(s1);

        for (Pokemon pokemon : battleParty) {
            System.out.println("You're Pokemon is: " + pokemon.getName() + " and this is a " + pokemon.getBaseType() + " type.");
        }
    }
}
