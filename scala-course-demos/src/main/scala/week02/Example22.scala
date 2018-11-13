package week02

object Example22 {

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)
  }

  def factorial(n: Int) = product(x => x)(1, n)

  def mapReduce(f: Int => Int, conbiner: (Int, Int) => Int, begin: Int)(a: Int, b: Int): Int = {
    if (a > b) begin
    else conbiner(f(a), mapReduce(f, conbiner, begin)(a + 1, b))
  }

  def product2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)

  def factorial2(n: Int) = product2(x => x)(1, n)
}
