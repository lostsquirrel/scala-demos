package demo.scala.syntax.test.func

import org.scalatest.FunSuite

class NestedMethodTest extends FunSuite {

    test("simple nested method") {
      assert(factorial(2) === 2)
      assert(factorial(3) === 6)
    }

  def factorial(x: Int): Int = {
    def fact(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else fact(x - 1, x * accumulator)
    }

    fact(x, 1)
  }
}
