package demo.scala.syntax.logging

object Logger {
  def info(message: String): Unit = println(s"INFO: $message")
}
