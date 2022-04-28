import java.util.concurrent.atomic.LongAccumulator
import scala.annotation.tailrec

object TailRecursive extends App {

  /*  def factorial(x: Int): Int = {
      if (x <= 1) 1 else x * factorial(x - 1)
    }
    //println(factorial(50000))*/

  def tailFactorial(n: BigInt): BigInt = {

    @tailrec
    def factorialHelper(x: BigInt, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else
        factorialHelper(x - 1, x * accumulator)
    }

    factorialHelper(n, 1)
  }

  println(tailFactorial(5))

  def concatenateString(x: String, n: Int): String = {
    @tailrec
    def concatHelper(n: Int, accumulator: String): String = {
      if (n <= 0) accumulator
      else concatHelper(n - 1, x + accumulator)
    }

    concatHelper(n, "")
  }

  println(concatenateString("Hello", 3)) // HelloHelloHello

  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciHelper(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fibonacciHelper(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fibonacciHelper(2, 1, 1)
  }

  println(fibonacci(7)) // 13

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeHelper(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeHelper(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeHelper(n / 2, isStillPrime = true)
  }

  println(isPrime(2003)) // true

}
