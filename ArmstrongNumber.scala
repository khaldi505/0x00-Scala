import scala.io.StdIn.readInt

object ArmstrongNumber extends App {
    
    def armStrongNumber(n: Int) = {
        var temp = n
        var p = 0
        while (n >0)
        rem = n % 10
        p = (p) + (rem * rem * rem)
        n = n / 10
        if (temp == p)
            print("armstrong")
        else
            print("not a armstrong number")
    }

    print("please enter a number")
    var number = readInt()
    x = number.toString()
    print(x[0])
}