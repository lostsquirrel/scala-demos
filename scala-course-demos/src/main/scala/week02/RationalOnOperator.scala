package week02

class RationalOnOperator(x: Int, y: Int) {
  require(y != 0, "denominator must not be zero")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  private val g: Int = gcd(math.abs(x), y)
  var numer: Int = x / g
  var denom: Int = y / g

  def this(x: Int) = this(x, 1)

  def +(that: RationalOnOperator): RationalOnOperator =
    new RationalOnOperator(numer * that.denom + that.numer * denom, denom * that.denom)

  def -(that: RationalOnOperator): RationalOnOperator = this + -that

  def unary_- : RationalOnOperator = new RationalOnOperator(-numer, denom)

  def <(that: RationalOnOperator): Boolean = numer * that.denom < that.numer * denom

  def *(that: RationalOnOperator): RationalOnOperator = new RationalOnOperator(numer * that.numer, denom * that.denom)

  def max(that: RationalOnOperator): RationalOnOperator = if (this < that) that else this

  override def toString: String = numer + "/" + denom
}
