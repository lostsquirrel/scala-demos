package demo.scala.syntax.test.list

import org.scalatest.FunSuite
import demo.scala.syntax.list.ListDemos._

class ListDemosTest extends FunSuite {

  val emptyList = List()

  val intList = List(1, 2, 3, 4, 5)

  test("test last of empty") {
    assertThrows[Error] {
      last(emptyList)
    }
  }

  test("test last of int list") {
    assert(last(intList) === 5)
  }

  test("test correction of init") {
    assert(last(init(intList)) === 5)
  }

  test("test empty concat int list") {
    assert(last(concat(emptyList, intList)) === 5)
  }

  test("test int list concat int list") {
    assert(concat(intList, intList).length === 10)
  }
}
