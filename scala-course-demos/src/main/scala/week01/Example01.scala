package week01

import scala.annotation.tailrec

object Example01 {
  def abs(x:Double) = if (x < 0) -x else x

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) = abs(guess * guess - x) / x < 1e-9

  def improve(guess: Double, x: Double) =(guess + x / guess) / 2

  def sqrt(x: Double) = sqrtIter(1.0, x)


  def sqrt2(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) = abs(guess * guess - x) / x < 1e-9

    def improve(guess: Double) =(guess + x / guess) / 2
    sqrtIter(1.0)
  }

  def factorial(x: Int): Int = {
    if (x == 0) 1 else x * factorial(x - 1)
  }

  def factorial2(x: Int) = {
    @tailrec
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc else loop(acc * n, n - 1)
    loop(1, x)
  }
  def main(args: Array[String]): Unit = {
    println(sqrt(1e-6))
    println(sqrt(1e-20))
    println(sqrt(1e20))
    println(sqrt(1e50))
    println(sqrt2(1e-6))
    println(sqrt2(1e-20))
    println(sqrt2(1e20))
    println(sqrt2(1e50))
  }
}
