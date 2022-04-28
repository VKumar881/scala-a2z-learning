/*
object SingleTonScalaGround{

val name="VIvek"

}
/*
Scala does not know the concept of static.
 It has something even better that is known as object that actually has static like functionality.

####Scala object is a Singleton instance.
*/


object SingletonClass  extends App{
  println(SingleTonScalaGround.name)
  val mary = new Person
  val tom = new Person
  println(mary == tom) // false


  /*val mary = SingleTonScalaGround
  val tom = SingleTonScalaGround

  println(mary == tom) // true
  // Since mary and tom are pointing out to the same single instance, hence both are equal*/
}


/*
* This pattern of writing classes and objects with the same name in the same scope is known as Companion
* */

object Person {
  // Class(static) Level Functionalities
}

class Person {
  // Instance Level Functionalities
}

*/
