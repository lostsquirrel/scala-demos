package demo.scala.syntax.test.for_comprehensions

import demo.scala.syntax.for_comprehensions.User
import demo.scala.syntax.for_comprehensions.ForComprehensionsDemos._
import org.scalatest.FunSuite

class ForComprehensionsTests extends FunSuite{

  test("test for comprehensions basic") {
    val userBase = List(User("Travis", 28),
      User("Kelly", 33),
      User("Jennifer", 44),
      User("Dennis", 23))

    val twentySomethings = for (user <- userBase if (user.age >= 20 && user.age < 30)) yield user.name

    twentySomethings.foreach(name => println(name))  // prints Travis Dennis
    assert(twentySomethings.length === 2)

  }

  test("test more generators") {
    foo(10, 10) foreach {
      case (i, j) =>
        println(s"($i, $j) ")  // prints (1, 9) (2, 8) (3, 7) (4, 6) (5, 5)
    }
  }

  test("test without yield") {
    bar(10, 10)
  }
}

