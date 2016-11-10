package pokemon;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pokemon pikachu = new Pokemon("Pikachu", 10, 20, 80);
        Pokemon caterpie = new Pokemon("Caterpie", 10, 20, 50);

        System.out.println("Nombre: " + pikachu.getNom());
        System.out.println("Atac: " + pikachu.getAtac());
        System.out.println("Defensa: " + pikachu.getDefensa());
        System.out.println("Punts de Salut: " + pikachu.getPuntsdesalut());

        System.out.println("Nombre: " + caterpie.getNom());
        System.out.println("Atac: " + caterpie.getAtac());
        System.out.println("Defensa: " + pikachu.getDefensa());
        System.out.println("Punts de Salut: " + caterpie.getPuntsdesalut());


        PokemonAigua blastoise = new PokemonAigua("Blastoise", 10, 60, 300);
        PokemonAigua gyarados = new PokemonAigua("Gyarados", 30, 50, 200);

        PokemonPlanta bulbasaur = new PokemonPlanta("Bulbasaur", 50, 35, 180);
        PokemonPlanta xavik = new PokemonPlanta("Xavik", 40, 35, 95);

        PokemonFoc charmander = new PokemonFoc("Charmander", 35, 80, 600);
        PokemonFoc mark = new PokemonFoc("Mark", 55, 20, 500);

        System.out.println("NOM: " + blastoise.getNom() + " ATAQUE: " + blastoise.getAtac() + " Debil Contra: " + blastoise.getDefensa() + " PUNTOS SALUD: " + blastoise.getPuntsdesalut());
        System.out.println("NOM: " + gyarados.getNom() + " ATAQUE: " + gyarados.getAtac() + " Debil Contra: " + gyarados.getDefensa() + " PUNTOS SALUD: " + gyarados.getPuntsdesalut());

        System.out.println("NOM: " + bulbasaur.getNom() + " ATAQUE: " + bulbasaur.getAtac() + " DEFENSA: " + bulbasaur.getDefensa() + " PUNTOS SALUD: " + bulbasaur.getPuntsdesalut());
        System.out.println("NOM: " + xavik.getNom() + " ATAQUE: " + xavik.getAtac() + " DEFENSA: " + xavik.getDefensa() + " PUNTOS SALUD: " + xavik.getPuntsdesalut());

        System.out.println("NOM: " + charmander.getNom() + " ATAQUE: " + charmander.getAtac() + " DEFENSA: " + charmander.getDefensa() + " PUNTOS SALUD: " + charmander.getPuntsdesalut());
        System.out.println("NOM: " + mark.getNom() + " ATAQUE: " + mark.getAtac() + " DEFENSA: " + mark.getDefensa() + " PUNTOS SALUD: " + mark.getPuntsdesalut());

        //Dins del Main, crea una Arraylist amb un mínim de 6 pokémons. Crea un bucle perquè mostri la informació de cada pokémon i s’intenti capturar.
        List<Pokemon> pokemonLista = new ArrayList(6);
        pokemonLista.add(blastoise);
        pokemonLista.add(gyarados);
        pokemonLista.add(bulbasaur);
        pokemonLista.add(xavik);
        pokemonLista.add(charmander);
        pokemonLista.add(mark);

        for (Pokemon pokemonBucle : pokemonLista) {
            pokemonBucle.Dades();
            pokemonBucle.Capturar();

        }

// Crea una nova classe Encostipat que sigui Capturable. Implementa la funció apturar , afegeix una instància dins  l’arraylist i comprova si l’usuari el captura!
        List<Capturable> capturado = new ArrayList(6);
        pokemonLista.add(blastoise);
        pokemonLista.add(gyarados);
        pokemonLista.add(bulbasaur);
        pokemonLista.add(xavik);
        pokemonLista.add(charmander);
        pokemonLista.add(mark);

        for (Capturable CapturadoNO : capturado) {
            CapturadoNO.Capturar();
        }

    }
}
