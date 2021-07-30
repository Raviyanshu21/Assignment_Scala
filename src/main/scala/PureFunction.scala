import java.io._
import io.Source._

object PureFunction extends App {
  try {
    for (line <- fromFile("noFile.txt").getLines())
      println(line.toLowerCase())
  } catch {
    case e : FileNotFoundException => println("The file is not found")
    case _ : Exception => println("Your program has an error")

  }
  finally {
    println("Couldn't find the file")
  }


}
