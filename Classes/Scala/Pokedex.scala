import scala.io.Source

object Pokedex extends App{
    // val pokemon = new Pokemon(1, "Grass", None, "Bulbasaur")
    // println(pokemon.number)

    val fileSrc = Source.fromFile("pokemon.csv")
    val pokemonList = fileSrc.getLines.toList.drop(1).map{line => 
    	val info = line.split(",")
    	new Pokemon(info(0).toInt, info(2), Option(info(3)).filter(_.nonEmpty), info(1))
    }
    fileSrc.close

    val onix = pokemonList.find(_.name == "Onix")
    println(onix.get.number)
}