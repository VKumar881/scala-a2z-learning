object ExpressionExample extends App {

  val aCodeBlock = {
    val x = 2
    val y = x + 1

    if (y > 2) println("Hello") else println("Bye")
  }
  /**
   * Expression always evaluates to something
   * Compiler automatically identifies the type of an expression
   */
  val x = 1 + 2
  println(x) // 3

  println(2 + 3 * 4) // 14
  // + - * / ^ << >> >>>

  println(1 == x) // false
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=
  println(aVariable) // 5

  /**
   * Instructions (Do) vs Expressions (Value)
   * Everything in scala is an expression
   * Only definition such as variables definition, method definition, packages and class definition,etc are not expressions
   */

  /**
   * IF Expression
   */
  val a = if (true) 3 else 5
  println(a) // 3
  println(if (true) 3 else 5) // 3

  /**
   * Never use loops in scala as we use in imperative programming language
   * It can lead to side effects
   */
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  } // NEVER USE THIS IN SCALA

  /**
   * Unit Type Expression
   * Unit in scala is similar to void in java
   * Its a type of side effect in scala which we avoid
   * Side Effects Examples: while, println, etc
   */
  val aWeirdValue: Unit = (aVariable = 3)
  println(aWeirdValue)

  /**
   * Code Block Expressions
   * The value of a block is the value of the last expression in the block
   */

}