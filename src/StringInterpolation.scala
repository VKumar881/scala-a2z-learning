object StringInterpolation extends App {

  val age: Int = 20
  val name: String = "vivek"
  lazy val c: Int = 30
  val aString = s"My name is $name and I am ${age + 1} years old"

  println(aString)

  val speed = 1.2f
  val bString = f"$name can eat $speed%.2f burgers per minute"

  println(bString)

  val cString = raw"This is a \n newline"

  println(cString)
}
