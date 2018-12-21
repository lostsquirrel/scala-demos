package test.week03

import org.scalatest.FunSuite
import test.week03.list.{ConsList, NilList}

class ImmutableLinkedListTest extends FunSuite {

  val empty = new NilList[Int]()
  test("test nil empty") {
    assert(empty.isEmpty)
  }

  test("test nil head") {
    assertThrows[NoSuchElementException] {
      empty.head
    }
  }

  test("test nil tail") {
    assertThrows[NoSuchElementException] {
      empty.tail
    }
  }

  val c = new ConsList[Int](1, new NilList[Int]())

  test("test cons empty") {
    assert(!c.isEmpty)
  }

  test("test cons head") {
    assert(c.head === 1)
  }

  test("test cons tail") {
    assert(c.tail.isEmpty)
  }
}
