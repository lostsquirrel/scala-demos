package week02
import exercise._
import org.scalatest.FunSuite
class Week2Test extends FunSuite {

  test("test sum") {
    assert(sum(x => x * x)(3, 5) == 50)
  }
}
