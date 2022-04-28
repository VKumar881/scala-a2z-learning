object VariableExample {

  def main(args: Array[String]): Unit ={

    val x:Int=2
    println(x)
    // Will give compile error as x is being reassigned to 2
    // x = 2

    var x1:Int=5
    println(x1)
    x1=7
    println(x1)

//    Basic Data Types: Boolean, Char, Int, Short, Long, Double, Float, String

    val aBoolean: Boolean = true
    val aChar: Char = 'a'
    val anInt: Int = 2
    val aShort: Short = 1234
    val aLong: Long = 12345678912L
    val aDouble: Double = 3.14
    val aFloat: Float = 3.14F


  }

}
