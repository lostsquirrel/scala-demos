package demo.scala.syntax.test.traints

import demo.scala.syntax.traints.{Cat, Dog, IntIterator, Pet}
import org.scalatest.FunSuite

import scala.collection.mutable.ArrayBuffer

class TraintsTest extends FunSuite {


  test("int iterator demo") {
    val iterator = new IntIterator(2)
    assert(iterator.next() === 0)
    assert(iterator.next() === 1)
    assert(iterator.next() === 0)
  }

  test("pet demo") {
    val dog = new Dog("Harry")
    val cat = new Cat("Sally")

    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)
    animals.foreach(pet => println(pet.name))  // Prints Harry Sally
    assert(animals(0).name === "Harry")
    assert(animals(1).name === "Sally")
  }
}
