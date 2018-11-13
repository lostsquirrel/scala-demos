package demo.scala.syntax.test.mixin

import demo.scala.syntax.mixin.{D, RichIterator, RichStringIter, StringIterator}
import org.scalatest.FunSuite

class MixinTest extends FunSuite {

  test("mixin") {
    val d = new D
    println(d.message)  // I'm an instance of class B
    println(d.loudMessage)  // I'M AN INSTANCE OF CLASS B
  }

  test("iterator") {

    val richStringIter = new RichStringIter
    richStringIter foreach println
  }
}
