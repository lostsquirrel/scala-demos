package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0) 1
    else {
      if (c == r) 1
      else
        pascal(c - 1, r - 1) + pascal(c, r - 1)
    }


  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    val x = 0

    def loop(charsx: List[Char], depth: Int): Int = {
      if (depth >= 0 && !charsx.isEmpty) {
          if (charsx.head == '(') loop(charsx.tail: List[Char], depth + 1)
          else if (charsx.head == ')') loop(charsx.tail: List[Char], depth - 1)
          else
            loop(charsx.tail: List[Char], depth)
      } else {
        depth
      }
    }

    loop(chars, 0) == 0
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    var res = 0
    val coinsx = coins.sortWith(_ < _)
    val start = coins.length - 1

    def counter(cm: Int, index: Int): Int = {
      val coin = coinsx(index)
      if (index > 0 && cm > 0) {
        if (cm >= coin) counter(cm - coin, index)
        else counter(cm, index - 1)
      }
      cm
    }

    def loop(index: Int): Unit = {
      if (index > 0) {
        val i = counter(money, index)
        //        println(i)
        if (i == 0) res += 1
        loop(index - 1)
      }

    }

    loop(start)
    res
  }
}
