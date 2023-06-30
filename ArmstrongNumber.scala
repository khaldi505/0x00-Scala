import scala.io.StdIn.readInt
object ArmstrongNumber extends App {
  def isArmstrongNumber(number: Int): Boolean = {
    val digits = number.toString.map(_.asDigit)
    val sumOfPowers = digits.map(x => x * x * x).sum
    number == sumOfPowers
  }

  print("Enter a three-digit number: ")
  var number = readInt()

  val isArmstrong = isArmstrongNumber(number)

  if (isArmstrong) {
    println("The number is an Armstrong number.")
  } else {
    println("The number is not an Armstrong number.")
  }

}
