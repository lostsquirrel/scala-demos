package demo.scala.syntax


class SimpleGreeter(prefix: String, suffix: String) {
  def greet(name: String): String = {
    prefix + name + suffix
  }
}

trait Greeter {
  def greet(name: String): String =
    "Hello, " + name + "!"
}

class DefaultGreeter extends Greeter

class CustomizableGreeter(prefix: String, suffix: String) extends Greeter {

  override def greet(name: String): String = {
    prefix + name + suffix
  }

}

