import scala.io.StdIn.readInt
object BiggerNumber extends App {
    def biggerNumber(firstNum: Int, secondNum: Int, lastNum: Int) = if (firstNum >= secondNum && firstNum >= lastNum) firstNum else if (secondNum >= firstNum && secondNum >= lastNum) secondNum else lastNum 
    println("enter digit on prompt")
    println("enter the first number")
    val fn = readInt()
    println("enter the second number")
    val sn = readInt()
    println("enter the last number")
    val ln = readInt()
    val r = biggerNumber(fn, ln, sn)
    println(r)
}