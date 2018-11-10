package week01

import org.scalatest.FunSuite
import week01.Example01._
class Week1Test extends FunSuite {

  test("test recursive factorial"){
    assert(factorial(4) === 24)
  }
  test("test tail recursive factorial"){
    assert(factorial2(4) === 24)
  }
}
