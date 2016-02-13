package progfun.week1

/**
  * Created by alex on 13/02/2016.
  */
object ExerciseW1 {

  def pascal(c: Int, r: Int): Int = {
    def factorial(x: Int, accu: Int): Int = {
      if (x == 0) accu else factorial(x - 1, x * accu)
    }
    factorial(r, 1)/(factorial(r - c, 1) * factorial(c, 1))
  }
}
