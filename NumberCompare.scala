import scala.io.StdIn.readLine

object NumberCompare extends App {
    def numberCompare(firstNumber: Long, secondNumber: Long ) = {
        if (firstNumber > secondNumber){
            print("The larger number is " + firstNumber.toString())
        }
        else if (secondNumber > firstNumber){
            print("The larger number is " + secondNumber.toString())
        }
         
    }
    print("Enter the first number: ")
    val firstNumber = readLine()
    print("Enter the second number: ")
    val secondNumber = readLine()

    numberCompare(firstNumber.toLong,secondNumber.toLong)
}