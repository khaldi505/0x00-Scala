// The five letters A, E, I, O and U are called vowels.
// All other alphabets except these 5 vowels are called consonants.
import scala.io.StdIn.readChar




object VowelOrConsonant extends App(){
    def vowelOrConsonant(character: Char) = {

        if ("AaEeIiOoUu".head == character){
            print("The character is a vowel.")
        }
        else 
            print("The character is a consonant.")
        
    }

    println("Please enter a character to check bellow:")
    var character = readChar()
    vowelOrConsonant(character)
}