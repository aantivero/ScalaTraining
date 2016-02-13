package progfun.week2

/**
  * Created by alex on 09/02/2016.
  */
object TailRecursion extends App{

  //implement a function that computes the greatest common divisor of two numbers
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  println(gcd(14, 21))
}

/**
  * gcd(14, 21) is evaluated as follow
  * if (21 == 0) 14 else gcd(21, 14 % 21)
  * if (false) 14 else gcd(21, 14 % 21)
  * gcd(21, 14 % 21)
  * gcd(21, 14)
  * if (14 == 0) 21 else gcd(14, 21 % 14)
  * if (false) 21 else gcd(14, 21 % 14)
  * gcd(14, 21 % 14)
  * gcd(14, 7)
  * ...
  * gcd(7, 0)
  * if (0 == 0) 7 else gcd(0, 7 % 0)
  * 7
  */
