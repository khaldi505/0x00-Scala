import scala.io.StdIn.readChar

object CharOrNum extends App {
    def charOrNum (character: Char) = {
        if (character.isInstanceOf[Char]) {
            if (character.toInt >= 97 && character.toInt <= 122)
                print("lowercase")
            else if (character.toInt >= 65 && character.toInt <= 90){
                print("uppercase")
            }
            else if (character.toInt >= 48 && character.toInt <= 57)
                print("number")
        }
        else
            print("Please enter a character or a number")
    }
    while (true){
        println("Please enter a character or a number\nonly the first char will be parsed")
        var character = readChar()
        print(character)
        charOrNum(character)
    }

}