object DefaultAndNameArgument extends  App {

  /**
   * Named Arguments
   */
  def savePicture(format: String, width: Int, height: Int): Unit = {
    println("Saved")
  }

  println(savePicture(format = "jpeg", width = 800, height = 600))


  /**
   * Default Arguments
   */
  def saveDefaultPicture(format: String = "jpeg", width: Int, height: Int): Unit = {
    println("Saved")
  }

  /**
   * Compilation error: Found Int, Required String
   */
 /* saveDefaultPicture(800, 600)

  saveDefaultPicture(width = 800, 600) *///geting error


  saveDefaultPicture("jpeg", 800, 600)

  saveDefaultPicture(width = 800, height = 600)
  saveDefaultPicture(format = "bmp", width = 800, height = 600)
}
