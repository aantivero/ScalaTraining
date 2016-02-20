package progfun.week1

import org.scalatest.FunSuite

/**
  * Write a recursive function that counts how many different ways you can make change for an amount,
  * given a list of coin denominations.
  * Created by alex on 20/02/2016.
  */
class CountingChangeSuite extends FunSuite {

  import ExerciseW1.countChange

  test("There are 3 ways to give change for 4 if you have coins with denomiation 1 and 2"){
    assert(countChange(4, List(1, 2)) == 4)
  }
}