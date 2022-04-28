object MainMethodes extends App {

    // Using yield with for
  val ls:List[String]=List("vivek","vikas")
    var print = for( i <- ls) yield i
    for(j<-print)
    {
      // Printing result
      println(j)
    }


}
