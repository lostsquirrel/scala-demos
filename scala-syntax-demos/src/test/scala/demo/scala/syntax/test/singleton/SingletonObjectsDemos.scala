package demo.scala.syntax.test.singleton

import demo.scala.syntax.logging.Logger
import demo.scala.syntax.singleton.{Circle, Email}
import org.scalatest.FunSuite

class SingletonObjectsDemos extends FunSuite {

  test("object method") {
    Logger.info("Created projects")
  }

  test("companion object") {
    val circle1 = new Circle(5.0)

    assert(circle1.area == math.Pi * 25)
  }

  test("companion object factory method") {
    val scalaCenterEmail = Email.fromString("scala.center@epfl.ch")
    scalaCenterEmail match {
      case Some(email) => println(
        s"""Registered an email
           |Username: ${email.username}
           |Domain name: ${email.domainName}
     """)
      case None => println("Error: could not parse email")
    }
  }
}
