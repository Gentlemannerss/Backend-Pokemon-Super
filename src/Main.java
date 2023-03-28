package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DoubleTypePokemon b2 = new DoubleTypePokemon("Bulbasaur", Type.Grass, 5000, 5,10, Type.Poison, 120, 20, new Stat(110,5,8));
        SingleTypePokemon c1 = new SingleTypePokemon("Charmander", Type.Fire, 1100.2,11, 22, 60, 40, new Stat(110,5,13));
        SingleTypePokemon p1 = new SingleTypePokemon("Pikachu", Type.Electric,5000,5,10,40,25, new Stat(110,5,7));
        SingleTypePokemon s1 = new SingleTypePokemon("Squirtle", Type.Water, 14000.5, 14, 28, 64, 35, new Stat(110,5,20));

        c1.eats();

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
