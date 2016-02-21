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

  def balance(chars: List[Char]): Boolean = {
    def balanced(chars: List[Char], count: Int): Boolean = {
      chars match {
        case Nil => count == 0
        case '(' :: tail => balanced(tail, count + 1)
        case ')' :: tail => count > 0 && balanced(tail, count - 1)
        case _ :: tail => balanced(tail, count)
      }
    }
    balanced(chars, 0)
  }

  def countChange(money: Int, coins: List[Int]): Int = {
    def loop(pending: Int, remaining: List[Int]): Int = {
      if (remaining.isEmpty) 0
      else if (pending < 0) 0
      else if (pending == 0) 1
      else loop(pending - remaining.head, remaining) + loop(pending, remaining.tail)
    }
    loop(money, coins)
  }
}
