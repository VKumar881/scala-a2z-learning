
import scala.collection.mutable.ListBuffer

import scala.annotation.tailrec

object MethodsExample extends App {


  def aFunction(x: String, y: Int): String = {

    x + "===" + y
  }

  println(aFunction("hello", 10))

  /**
   * A parameterless function
   */
  def aParameterlessFunction: Int = 42

  /*recursive*/

  def aRecursive(x: Int): Int = {
    if (x == 1 || x == 0) 1 else x * aRecursive(x - 1)

  }

  println(aRecursive(5))

  /**
   * Scala automatically infers the return type of functions
   * Scala needs explicit return type for recursive functions
   */
  def bFunction(a: String, b: Int) = {
    a + " " + b
  }

  def fibonacci(n: Int): Int = {
    if (n <= 3) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(5))

  def fibonacci_p(number: Int): Unit = {
    val nums: ListBuffer[Int] = ListBuffer(0, 1)
    for (i <- Range(1, number)) {

      nums += (nums(i) + nums(i - 1))

    }
    nums.foreach(p => print(p + " "))


  }


  fibonacci_p(5)

  //  println(list1.reverse)

  //  def fibonacci_p(n: Int): BigInt = n match {
  //    case n if n < 0 => (if (n % 2 == 0) -1 else 1) * fibonacci(-n)
  //    case 0 => 0
  //    case 1 => 1
  //    case n => fibonacci_p(n - 2) + fibonacci_p(n - 1)
  //  }

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else (n % t) != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(3))

}
