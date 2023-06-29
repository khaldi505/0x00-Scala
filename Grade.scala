import scala.io.StdIn.readChar

object Grade extends App {
    def gradeEval(grade: Char) = {
        grade match {
            case 'A' => println("Excellent!")
            case 'B' => println("Good job!")
            case 'C' => println("Keep it up!")
            case 'D' => println("You need to improve")
            case 'F' => println("Failed")
        }
    }
    println("please enter your grade")
    var grade = readChar()
    gradeEval(grade)
}