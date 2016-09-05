import model.{Shapes, Shape, Square, Triangle}

object HelloShapesMain {
  
    def main(args: Array[String]): Unit = {
    println("Hello, world!")
		
    val square1 = Square("square1", 2.0)
    val triangle1 = Triangle("triangle1", 2.0, 2.0)

		System.out.println("area(square): " + square1.name + ", " + Shapes.area(square1) )
		System.out.println("area(triangle1): " + triangle1.name + ", " + Shapes.area(triangle1) )
	
    }
}