package demo.scala.syntax.test

import demo.scala.syntax.{CustomizableGreeter, DefaultGreeter, Greeter, SimpleGreeter}
import org.scalatest.FunSuite


class BasicTest extends FunSuite {
  import MethodDemo._

  test("Add x and y") {
    assert(add(1, 2) === 3)
  }

  test("get square as string") {
    assert(getSquareString(3) === "9.0")
  }

  test("Greeter class") {
    val greeter = new SimpleGreeter("Hello, ", "!")
    assert(greeter.greet("Scala developer") === "Hello, Scala developer!")
  }

  test("test case class") {
    val point = new Point(1, 2)
    val anotherPoint = new Point(1, 2)
    var yetAnotherPoint = new Point(2, 2)
    println(point)
    assert(point === anotherPoint)
    assert(point !== yetAnotherPoint)
  }

  test("test object") {
    assert(IdFactory.create() === 1)
    assert(IdFactory.create() === 2)
  }

  test("test traits") {
    val greeter = new DefaultGreeter
    assert(greeter.greet("Scala developer") === "Hello, Scala developer!")

    val customGreeter = new CustomizableGreeter("How are you, ", "?")
    assert(customGreeter.greet("Scala developer") === "How are you, Scala developer?")
  }
}

object MethodDemo {
  def add(x: Int, y: Int): Int = x + y
  println(add(1, 2))

  def addThenMultiply(x: Int, y: Int)(multiplier: Int) = (x + y) * multiplier
  println(addThenMultiply(1, 2)(3))

  def name: String = System.getProperty("user.name")
  println("Hello, " + name + "!")

  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }
  println(getSquareString(3))

}

case class Point(x: Int, y: Int)

object IdFactory {
  private var counter = 0;
  def create(): Int = {
    counter += 1;
    counter
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, Scala developer!")
  }
}