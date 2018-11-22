package demo.scala.syntax.test.clazz.caze

import demo.scala.syntax.clazz.caze.{Book, Message}
import org.scalatest.FunSuite

class CaseClassTest extends FunSuite {

  test("simple case class") {
    val frankenstein = Book("978-0486282114")
    println(frankenstein)
  }

  test("try change case class") {
    var message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")
    println(message1)
//    message1.sender = "travis@washington.us"
    assertTypeError("message1.sender = \"travis@washington.us\"")
  }

  test("test compare") {
    val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    assert(message2 == message3)
  }

  test("test copy") {
    val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
    val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")

    assert(message5.sender === "travis@washington.us")
    assert(message5.recipient=== "claire@bourgogne.fr")
    assert(message5.body === "Me zo o komz gant ma amezeg")
  }
}
