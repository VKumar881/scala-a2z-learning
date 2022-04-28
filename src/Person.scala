/*
//Often in practice we have a factory method 'apply' in a singleton object.
// The sole purpose of this factory method is to build an instance of the class given some parameters.


object Person {
  def apply(name: String): Person = new Person(name)
}

class Person(val name: String) {
  // Instance Level Functionalities
}
//We can then call the apply method to get the instance of the Person class

object Main extends App{

  val tom1 = Person.apply("Tom")
  //We can even remove the 'apply' from the above method calling statement and it will look like:


  val tom = Person("Tom")
}
*/
