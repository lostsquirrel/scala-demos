package test.week03

import org.scalatest.FunSuite


class SubBaseTest extends FunSuite {

  test("test override") {
    val s = new Sub
    assert(s.foo === 2)
    assert(s.bar === 3)
  }
}
