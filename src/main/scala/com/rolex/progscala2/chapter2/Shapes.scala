package com.rolex.progscala2.chapter2

/**
  * Created by rolex on 5/12/17.
  */
object Shapes {

  def main(args: Array[String]): Unit = {
    val p00 = new Point()
    val p20 = new Point(2.0)
    val p20b = new Point(2.0)
    val p02 = new Point(y = 2.0)
    println(p20 == p20b)
    println(p00 == p20)
  }

}

case class Point(x: Double = 0d, y: Double = 0d) {
  def shift(deltax: Double = 0.0, deltay: Double = 0.0) = copy(x + deltax, y + deltay)
}

abstract class Shape() {
  def draw(f: String => Unit): Unit = f(s"draw: ${this.toString}")

  // 多个参数列表
  def draw1(offset: Point)(f: String => Unit): Unit = f(s"draw(offset = $offset): ${this.toString}")
}

case class Circle(center: Point, radius: Double) extends Shape

case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape

case class Triangle(point1: Point, point2: Point, point3: Point) extends Shape