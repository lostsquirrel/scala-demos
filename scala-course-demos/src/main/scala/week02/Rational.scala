package week02

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must not be zero")
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(math.abs(x), y)
  var numer = x / g
  var denom = y / g

  def this(x: Int) = this(x, 1)

  def add(that: Rational) =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def sub(that: Rational) = add(that.neg)

  def neg: Rational = new Rational(-numer, denom)

  def less(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this.less(that)) that else this

  override def toString = numer + "/" + denom
}
