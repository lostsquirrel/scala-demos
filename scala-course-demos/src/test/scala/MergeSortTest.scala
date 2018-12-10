import org.scalatest.FunSuite

import week05.MergeSort._

class MergeSortTest extends FunSuite {
  val list = List(2, -4, 7, 3, 1)

  val fruit = List("apple", "pear", "orange", "pineapple")

  test("test v1") {
    assert(msort(list).head === -4)
  }

  test("test v2") {
    assert(msort_v2(list).head === -4)
  }

  test("test v3") {
    assert(msort_v3(list)((x, y) => x < y).head === -4)
    assert(msort_v3(fruit)((x: String, y: String) => x.compareTo(y) < 0).tail.head === "orange")
  }

  test("test v4") {
    assert(msort_v4(list)(Ordering.Int).head === -4)
    assert(msort_v4(fruit)(Ordering.String).tail.head === "orange")
  }

  test("test v5") {
    assert(msort_v5(list)(Ordering.Int).head === -4)
    assert(msort_v5(fruit)(Ordering.String).tail.head === "orange")
  }
}
