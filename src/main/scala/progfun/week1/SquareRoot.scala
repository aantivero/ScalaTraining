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

  def sqrt(x: Double): Double = sqrtIter(1.0, x)

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.001

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  println(sqrt(2))
  println(sqrt(4))
}