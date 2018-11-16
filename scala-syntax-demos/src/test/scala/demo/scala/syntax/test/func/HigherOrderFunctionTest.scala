package demo.scala.syntax.test.func

import org.scalatest.FunSuite

class HigherOrderFunctionTest extends FunSuite {


  test("map function in collection") {
    val salaries = Seq(20000, 70000, 40000)
    val doubleSalary = (x: Int) => x * 2
    val newSalaries = salaries.map(doubleSalary) // List(40000, 140000, 80000)

    newSalaries foreach println

    assert(newSalaries(0) === 40000)
  }

  test("anonymous function to map") {
    val salaries = Seq(20000, 70000, 40000)
    val newSalaries = salaries.map(x => x * 2) // List(40000, 140000, 80000)
    assert(newSalaries(0) === 40000)
  }

  test("idiomatic way of function to map") {
    val salaries = Seq(20000, 70000, 40000)
    val newSalaries = salaries.map(_ * 2)
    assert(newSalaries(0) === 40000)
  }

  test("Coercing methods into functions") {
    val weeklyWeatherForecast = new WeeklyWeatherForecast(Seq(22, 24, 26, 28, 30, 18, 0))
    weeklyWeatherForecast.forecastInFahrenheit foreach println
  }

  test("test SalaryRiser first version") {
    val salaries = List(20000.0, 70000, 40000)
    SalaryRaiserV1.smallPromotion(salaries) foreach println
    SalaryRaiserV1.greatPromotion(salaries) foreach println
    SalaryRaiserV1.hugePromotion(salaries) foreach println
  }
}

case class WeeklyWeatherForecast(temperatures: Seq[Double]) {

  private def convertCtoF(temp: Double) = temp * 1.8 + 32

  def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF) // <-- passing the method convertCtoF
}

object SalaryRaiserV1 {

  def smallPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * salary)
}

object SalaryRaiserV2 {

  private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
    salaries.map(promotionFunction)

  def smallPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * 1.1)

  def bigPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * salary)
}