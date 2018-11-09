package demo.scala.syntax.test.clazz

import demo.scala.syntax.clazz._
import org.scalatest.FunSuite

class PointTest extends FunSuite{

  test("empty class") {
    val p = new PointA
    println(p)
  }

  test("normal class with constructor parameters") {
    val pb = new PointB(2, 3)
    println(pb)
    assert(pb.x === 2)
  }

  test("class constructor parameter has default value") {
    val pc1 = new PointC
    println(pc1)
    val pc2 = new PointC(1)
    println(pc2)
    assert(pc2.x === 1)
    val pc3 = new PointC(y = 2)
    println(pc3)
    assert(pc3.y === 2)
  }

  test("test private member with getter setter") {
    val p = new PointD
    p.x = 99
    p.y = 101
    print(p)
    assert(p.y === 0)
  }

  test("test final constructor parameter") {
    val point = new PointE(1, 2)
    assertDoesNotCompile("point.x = 3")
  }

  test("test private constructor parameter") {
    val point = new PointF(1, 2)
    assertDoesNotCompile("point.x = 3")
  }
}
