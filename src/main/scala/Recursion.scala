import scala.io.StdIn._

object Recursion extends App {
  println("Enter the number: ")
  var n = readInt()

  def fibo(n: Int): Long = {
    if (n <= 0) 0 else if (n == 1) 1 else fibo(n - 1) + fibo(n - 2)
  }

  for (i <- List.range(0, n))
    yield (println(fibo(i) + ", "))
  println("....")

}
