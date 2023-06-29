import scala.io.StdIn.readInt
object PrimeNumbers extends App {
    def isPrime(i :Int) = {
        if (i <= 1){
            print("The number is not prime.")}
        else if (i == 2){
            print("The number is prime.")}
        else
            if (!(2 to (i-1)).exists(x => i % x == 0)){
                print("The number is prime.")}
            else{
                print("The number is not prime.")}
    }
    println("Please enter a positive number")
    var number = readInt()
    isPrime(number)
}