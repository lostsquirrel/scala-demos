package week05

import org.scalatest.FunSuite
import week05.HighOrderListFunctions._

class HighOrderListFunctionsTest extends FunSuite {

  val xs = List(2.1, 3.14)
  val xs1 = List(2, 3)
  val xs2 = List(-999, 2, -45, 3, -23)

  test("test scaleList v1") {
    val xxs = scaleList(xs, 2.0)
    assert(xxs.head === 4.2)
    assert(xxs.tail.head === 6.28)
  }

  test("test scaleList by map") {
    val xxs = scaleListByMap(xs, 2.0)
    assert(xxs.head === 4.2)
    assert(xxs.tail.head === 6.28)
  }

  test("test square List") {
    val xxs = squareList(xs1)
    assert(xxs.head === 4)
    assert(xxs.tail.head === 9)
  }

  test("test square List by map") {
    val xxs = squareListByMap(xs1)
    assert(xxs.head === 4)
    assert(xxs.tail.head === 9)
  }

  test("test pos element") {
    val xxs = posElems(xs2)
    assert(xxs.head === 2)
    assert(xxs.tail.head === 3)
  }

  test("test pos element by filer") {
    val xxs = posElemsByFilter(xs2)
    assert(xxs.head === 2)
    assert(xxs.tail.head === 3)
  }

  test ("test pack") {
    val x = pack(List("a", "a", "a", "b", "c", "c", "a"))
    assert(x.length === 4)
  }
  test ("test encode") {
    val x = encode(List("a", "a", "a", "b", "c", "c", "a"))
    assert(x.head._2 === 3)
  }

}
