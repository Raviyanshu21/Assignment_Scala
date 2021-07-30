class CompanionObjectExample {
  val str1 = "Assignment Completed?"
  val str2 = "Sorry Mentor it's half completed"

  def show(): Unit ={
    println(str1)
    println(str2)
  }

}

object CompanionObjectExample{
  def main(args: Array[String]): Unit = {
    val obj = new CompanionObjectExample
    obj.show()
  }
}


