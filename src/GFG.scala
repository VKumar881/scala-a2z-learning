

// Primary constructor
class GFG( Lname: String, Tname: String)
{
  var no: Int = 0;;
  def show()
  {
    println("Language name: " + Lname);
    println("Topic name: " + Tname);
    println("Total number of articles: " + no);

  }

  // Auxiliary Constructor
  def this(Lname: String, Tname: String, no:Int)
  {

    // Invoking primary constructor
    this(Lname, Tname)
    this.no = no
  }
}

// Creating object
object Main
{
  // Main method
  def main(args: Array[String])
  {

    // Creating object of GFG class
    var obj = new GFG("Scala", "Constructor", 4);
    obj.show();
  }
}
