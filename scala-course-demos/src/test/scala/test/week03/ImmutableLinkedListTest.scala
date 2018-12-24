package test.week03

import org.scalatest.FunSuite
import week03.list.{ConsList, NilList, ImmutableLinkedListUtils}

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

  test("test sample") {
    val i = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val l = ImmutableLinkedListUtils.sample[Int](i, 10)
    assert(l.head == 0)
//    println(l)
  }

  test("test indexOf") {
    val i = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val l = ImmutableLinkedListUtils.sample[Int](i, 10)
    assert(ImmutableLinkedListUtils.indexOf[Int](l, 3) === 3)
  }
}
