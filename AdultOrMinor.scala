import scala.io.StdIn.readLine

object AdultOrMinor extends App(){
    def adultOrMinor(age: Short) = {
        if (age < 18){
            print("You are a minor.")
        }
        else if (age >= 18){
            print("You are a adult.")
        }
    }
    print("Please enter your age bellow: ")
    var age = readLine()
    adultOrMinor(age.toShort)
}
