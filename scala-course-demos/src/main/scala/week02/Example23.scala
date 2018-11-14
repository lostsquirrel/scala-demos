package week02
import week02.Example23.averageDamp

import math.abs

object Example23 {

  def isCloseEnough(tolerance: Double)(x: Double, y: Double) = {
    abs((x - y)/x) / x < tolerance
  }

  def fixedPoint(tolerance: Double)(f: Double => Double)(firstGuess: Double): Unit = {
    def iterator(guess: Double): Double = {
      val next = f(guess)
      println(next)
      if (isCloseEnough(tolerance)(guess, next)) next
      else iterator(next)
    }

    iterator(firstGuess)
  }


  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2

  def sqrt(x: Double) = fixedPoint(0.0001)(y => (y + x / y) / 2)(1.0)

  def sqrt2(x: Double) = fixedPoint(0.0001)(averageDamp(y => x / y))(1.0)
}
