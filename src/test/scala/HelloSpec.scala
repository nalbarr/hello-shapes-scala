import org.scalatest._

import model.{Shapes, Shape, Square, Triangle}

class HelloShapesSpec extends FlatSpec with Matchers {
  
  val square1 = Square("square1", 2.0)
  val triangle1 = Triangle("triangle1", 2.0, 2.0)
  
  "Square1" should "have correct name " in {
     square1.name shouldEqual "square1"
  }
  "Square1" should "have correct area" in {
     Shapes.area(square1) shouldEqual 4.0
  }
  
  "Triangle1" should "have correct name " in {
     triangle1.name shouldEqual "triangle1"
  }
  "Triangle1" should "have correct area" in {
     Shapes.area(triangle1) shouldEqual 2.0
  }

}
