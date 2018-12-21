package week02

import org.scalatest.FunSuite

class RationalOnOperatorTest extends FunSuite {
  val x: RationalOnOperator = new RationalOnOperator(1, 3)
  val y: RationalOnOperator = new RationalOnOperator(2, 4)

  test("max infix") {
    val a = x max y
    assert(a.numer === 1)
    assert(a.denom === 2)
  }

  test("test add as +") {
    val a = x + y
    assert(a.numer === 5)
    assert(a.denom === 6)
  }

  test("sub as - ") {
    val a = x - y
    assert(a.numer === -1)
    assert(a.denom === 6)
  }

  test("less") {
    assert(x < y)
  }

  test("multiple as *") {
    val a = x * y
    assert(a.numer === 1)
    assert(a.denom === 6)
  }

  test("combine operator") {
    val a = x * y + x * y
    assert(a.numer === 1)
    assert(a.denom === 3)
  }
}