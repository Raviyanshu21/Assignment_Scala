import scala.io.StdIn._

object TailRec {
  println("Enter the number: ")
  var index = readInt()
  def getFib(index: Int): Int = {
    @annotation.tailrec
    def tailRec(index: Int, prev: Int, current: Int): Int = {
      if (index <= 0) current
      else {
        tailRec(index - 1, prev = prev + current, current = prev)
      }

    }
    tailRec(index, prev = 1, current = 0)
  }
  for(i <- List.range(0, index))
    yield (println(getFib(i) + ", "))
  println("....")

}
