package week02

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must not be zero")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  private val g: Int = gcd(math.abs(x), y)
  var numer: Int = x / g
  var denom: Int = y / g

  def this(x: Int) = this(x, 1)

  def add(that: Rational): Rational =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def sub(that: Rational): Rational = add(that.neg)

  def neg: Rational = new Rational(-numer, denom)

  def less(that: Rational): Boolean = numer * that.denom < that.numer * denom

  def max(that: Rational): Rational = if (this.less(that)) that else this

  override def toString: String = numer + "/" + denom
}
