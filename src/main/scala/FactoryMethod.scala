abstract class FactoryMethod {
  def bookingPrice: Double
  def facilities: List[String]
  def availability: Int
  def book(noOfRooms: Int)

}

object FactoryMethod{
  val STANDARD = 0
  val DELUXE = 1
  val SUPER_DELUXE = 2

  private class standardRoom extends FactoryMethod {
    private var _availability = 20
    override def bookingPrice = 70
    override def facilities = List("Queen Bed", "TV", "Chair", "Table", "Fan")
    override def availability = _availability
    override def book(noOfRooms: Int) = {
      _availability = _availability - noOfRooms
    }
  }

  private class DeluxeRoom extends FactoryMethod {
    private var _availability = 10
    override def bookingPrice = 90
    override def facilities = List("Bed", "TV", "Chair", "Table", "AC")
    override def availability = _availability
    override def book(noOfRooms: Int) = {
      _availability = _availability - noOfRooms
    }
  }

  private class superDeluxeRoom extends FactoryMethod {
    private var _availability = 5
    override def bookingPrice = 120
    override def facilities =
      List("Double Bed", "Single Bed", "TV", "Sofa", "Reading Table", "AC")
    override def availability = _availability
    override def book(noOfRooms: Int) = {
      _availability = _availability - noOfRooms
    }
  }
  def apply(roomType: Int): FactoryMethod = {
    roomType match {
      case SUPER_DELUXE => new superDeluxeRoom()
      case DELUXE       => new DeluxeRoom()
      case _            => new standardRoom()
    }
  }
}


