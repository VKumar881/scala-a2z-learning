class ClassObject1 {

  def name(name: String): Unit = {
  println(name)
  }


}

object Job extends App {
  val co=new ClassObject1()

  co.name("VIVEK")

  val person = new Person("Mary", 25)

  println(person.age) // 25

}

//The only way we can convert a class parameter to class field is by adding the val / var before the parameter

class Person(name: String, val age: Int)

