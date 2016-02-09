package progfun.week1

/**
  * Square Root with Newton's method.
  * To compute sqrt(x):
  *   - start with initial estimate y (let's pick y = 1)
  *   - repeatedly improve the estimate by taking the mean of y and x/y
  * Created by alex on 08/02/2016.
  */
object SquareRoot extends App{

  def abs(x: Double) = if (x < 0) -x else x

  def sqrt(x: Double) = {

    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0, x)
  }

  println(sqrt(2))
  println(sqrt(4))
  //improve for small anv very large numbers
  println(sqrt(0.001))
  println(sqrt(0.1e-20))
  println(sqrt(1e-6))
  println(sqrt(1.0e20))
  println(sqrt(1.0e50))//not terminate
  println(sqrt(1.0e60))//not terminate
}
