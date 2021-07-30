import java.util.Date

object PartiallyApplied {
  def log(date: Date, message: String)= {
    println(date + " " + message)
  }

  def main(args: Array[String]): Unit = {
    val date= new Date()
    val newLog = log(date, _ : String)
    newLog("This is message1")
  }

}
