class MethodNotation (val name:String, favoriteMovie:String) {

  def likes(movie:String):Boolean= movie==favoriteMovie

}

object MainMethod extends App {
  val mn = new MethodNotation("Vivek", "TUM BIN")
  println(mn.likes("TUM BIN"))
  println(mn likes "TUM BIN" )
}
