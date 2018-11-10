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
    var x = 0

    def loop(charsx: List[Char]): Unit = {
      if (!charsx.isEmpty) {
        if (charsx.head == '(') x += 1
        else if (charsx.head == ')')
          if (x > 0) x -= 1
          else {
            x = -1
            return
          }
        loop(charsx.tail: List[Char])
      }
    }

    loop(chars)
    x == 0
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    var res = 0
    coins.sortWith(_ < _)
    
    res
  }
}
