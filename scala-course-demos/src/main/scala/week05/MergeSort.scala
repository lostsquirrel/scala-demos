package week05

object MergeSort {

  def msort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[Int], ys: List[Int]): List[Int] = {
        xs match {
          case Nil =>
            ys
          case x :: xs1 =>
            ys match {
              case Nil =>
                xs
              case y :: ys1 =>
                if (x < y) x :: merge(xs1, ys)
                else y :: merge(xs, ys1)
            }
        }
      }
      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }

  }

  def msort_v2(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[Int], ys: List[Int]): List[Int] =
        (xs, ys) match {
          case (Nil, ys) => ys
          case (xs, Nil) => xs
          case (x :: xss, y :: yss) =>
            if (x < y) x :: merge(xss, ys)
            else y :: merge(xs, yss)
        }
      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  }

  def msort_v3[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] =
        (xs, ys) match {
          case (Nil, ys) => ys
          case (xs, Nil) => xs
          case (x :: xss, y :: yss) =>
            if (lt(x, y)) x :: merge(xss, ys)
            else y :: merge(xs, yss)
        }
      val (fst, snd) = xs splitAt n
      merge(msort_v3(fst)(lt), msort_v3(snd)(lt))
    }
  }

  def msort_v4[T](xs: List[T])(ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] =
        (xs, ys) match {
          case (Nil, ys) => ys
          case (xs, Nil) => xs
          case (x :: xss, y :: yss) =>
            if (ord.lt(x, y)) x :: merge(xss, ys)
            else y :: merge(xs, yss)
        }
      val (fst, snd) = xs splitAt n
      merge(msort_v4(fst)(ord), msort_v4(snd)(ord))
    }
  }

  def msort_v5[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] =
        (xs, ys) match {
          case (Nil, ys) => ys
          case (xs, Nil) => xs
          case (x :: xss, y :: yss) =>
            if (ord.lt(x, y)) x :: merge(xss, ys)
            else y :: merge(xs, yss)
        }
      val (fst, snd) = xs splitAt n
      merge(msort_v5(fst), msort_v5(snd))
    }
  }
}
