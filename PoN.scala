import scala.io.StdIn.readLine

object PoN extends App {

    // PoN : Positive or negative
    def Pon(number: Long) = {
        if (number == 0){
            print("0 is neither positive nor negative.")
        }
        if (number < 0){
            print("The number is negative.")
        }
        else {
            print("The number is positive.")
        }
    }
    print("Enter the number: ")
    val number = readLine()
    Pon(number.toLong)
}