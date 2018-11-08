println("hello world")

// expressions
1 + 1

println("hello " + "world")

val x = 1 + 1
println(x)

// x = 3 // This does not compile.

val y: Int = 2 + 2

var z = 3 + 3

z = 12
println(z * z)
var z2: Int = 4 + 4
// blocks

println({
  val x = 1 + 1
  x + 1
})

// Functions

(x: Int) => x + 1

val addOne = (x: Int) => x + 1
println(addOne(1))

val getTheAnswer = () => 42
println(getTheAnswer())

// Methods

