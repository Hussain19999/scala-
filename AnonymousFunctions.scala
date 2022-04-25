package lectures.part3fp

object AnonymousFunctions extends App {


  val doubler: Int => Int = (x: Int) => x * 2

  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b


  val justDoSomething: () => Int = () => 3


  println(justDoSomething) // function itself
  println(justDoSomething()) // call


  val stringToInt = { (str: String) =>
    str.toInt
  }


  val niceIncrementer: Int => Int = _ + 1 // equivalent to x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ // equivalent to (a,b) => a + b


  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(4))
}
