import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pokedex{
	public static void main(String[] args) {
        // Pokemon pokemon = new Pokemon(1, "Grass", "Poison", "Bulbasaur");
        // System.out.println(pokemon.getNumber());

		List<Pokemon> pokemonList = new ArrayList<Pokemon>();
        File inputF = new File("pokemon.csv");
        FileInputStream inputFS = new FileInputStream(inputF);
        BufferedReader fileBuffer = new BufferedReader(new InputStreamReader(inputFS));
        // skip the header of the csv
        pokemonList = fileBuffer.lines().skip(1).map( line -> {
        	String[] info = line.split(",");
    		Pokemon pokemon = new Pokemon(Integer.parseInt(info[0]), info[2], info[3], info[1]);
    		return pokemon;
        }).collect(Collectors.toList());
        fileBuffer.close();
        Pokemon onix = pokemonList.stream().filter( p -> p.getName() == "Onix").findFirst().get();
        System.out.println(onix.getNumber());
    }	
}