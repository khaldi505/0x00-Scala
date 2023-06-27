import scala.io.StdIn.readLine

object LeapYear extends App {
    def leapYear(year: Int) = {
        def leap(year: Int): Boolean = {
            (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
        }

        if (leap(year)){
            print("Leap year")
        }
        else 
            print("Not a leap year")
    }
    print("Enter the year: ")
    val year = readLine()
    leapYear(year.toInt)
}