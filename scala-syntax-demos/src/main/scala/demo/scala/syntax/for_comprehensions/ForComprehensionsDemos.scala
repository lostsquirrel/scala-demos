package demo.scala.syntax.for_comprehensions

object ForComprehensionsDemos {

  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- i until n if i + j == v)
      yield (i, j)

  def bar(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- i until n if i + j == v)
      println(s"($i, $j)")
}

