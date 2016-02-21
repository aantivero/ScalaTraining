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
    // 1+1+1+1, 1+1+2, 2+2
    assert(countChange(4, List(1, 2)) === 3)
  }

  test("There are 5 ways to give change for 5 if you have coins with denomination 1, 2 and 3"){
    //1+1+1+1+1, 1+2+2, 1+1+3, 2+3, 1+1+1+2
    assert(countChange(5, List(1, 2, 3)) === 5)
  }

  test("No coins return 0") {
    assert(countChange(4, List()) === 0)
  }

  test("Money equals 0 return 1 posibility"){
    assert(countChange(0, List(1, 2, 3)) === 1)
  }

  test("Money less than cero return 0"){
    assert(countChange(-1, List(1, 2, 3)) === 0)
  }
}
