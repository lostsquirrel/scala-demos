package week02

import org.scalatest.FunSuite

class RationalTest extends FunSuite {

    val x = new Rational(1, 3)
    val y = new Rational(2, 4)
//    val z =
    test("initial") {
        assert(x.numer === 1)
        assert(x.denom === 3)
    }

    test("initial reduction") {
        assert(y.numer === 1)
        assert(y.denom === 2)
    }

    test("test add") {
        val a = x.add(y)
        assert(a.numer === 5)
        assert(a.denom === 6)
    }

    test("sub") {
        val a = x.sub(y)
        println(x)
        println(y.neg)
        assert(a.numer === -1)
        assert(a.denom === 6)
    }

    test("less") {
        assert(x.less(y))
    }

    test("max") {
        val a = x.max(y)
        assert(a.numer === 1)
        assert(a.denom === 2)
    }

    test("divide by zero") {
        assertThrows[IllegalArgumentException] {
            new Rational(2, 0)
        }
    }

    test("second constructor") {
        val a = new Rational(4)
        assert(a.numer === 4)
        assert(a.denom === 1)
    }
}
