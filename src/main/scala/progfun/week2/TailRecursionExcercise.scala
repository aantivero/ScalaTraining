package progfun.week2

/**
  * Created by alex on 21/02/2016.
  */
object TailRecursionExcercise extends App{

  def factorial(n: Int): Int = {

    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)

    loop(1, n)
  }
}
/*
factorial(4)
loop(1, 4)
loop(1 * 4, 4 - 1)
loop(4, 3)
loop(4 * 3, 3 - 1)
loop(12, 2)
loop(12 * 2, 2 - 1)
...24 
 */