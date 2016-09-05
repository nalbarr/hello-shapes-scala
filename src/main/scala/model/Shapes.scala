package model

trait Shape
case class Square(name: String, side: Double) extends Shape
case class Triangle(name: String, base: Double, height: Double) extends Shape

object Shapes {
  def area(s: Shape) = s match {
    case Square(n, s) => s * s
    case Triangle(n, b, h) => 0.5 * b * h  
  }
}