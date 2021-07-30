object patternMatching extends App{
  def typeMatching(x:Any)= {
    x match {
      case i:Integer => "It's an integer: " + i
      case s:String => "It's a string: " + s
      case b:Boolean => "Its a boolean: " + b
      case _ => "Something Else"
    }
  }
  println(typeMatching(45.569))
  println(typeMatching("Knoldus"))
  println(typeMatching(false))
  println(typeMatching(21))
}
