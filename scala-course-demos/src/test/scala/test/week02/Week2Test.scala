package week02

import Example21._
import Example22._
import Example23._
import org.scalatest.FunSuite

class Week2Test extends FunSuite {

  test("test sum") {
    assert(sum(x => x * x)(3, 5) == 50)
  }

  test("test product") {
    assert(product(x => x * x)(3, 4) === 144)
  }

  test("test map reduce product") {
    assert(product2(x => x * x)(3, 4) === 144)
  }

  test("test currying version of factorial") {
    assert(factorial(5) === 120)
  }

  test("test currying version of factorial2") {
    assert(factorial2(5) === 120)
  }

  test("test sqrt") {
    println(sqrt(2))
  }
  test("test sqrt2") {
    println(sqrt2(2))
  }

}
