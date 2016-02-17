package progfun.week1

import org.scalatest.FunSuite

/**
  * Created by alex on 16/02/2016.
  */
class ParenthesesBalancingSuite extends FunSuite {
  import ExerciseW1.balance;

  test("(if (zero? x) max (/ 1 x)) == true"){
    assert(balance("(if (zero? x) max (/ 1 x))".toList) == true)
  }

  test("I told him (that it’s not (yet) done). (But he wasn’t listening) == true"){
    assert(balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList) == true)
  }

  test(":-) == false"){
    assert(balance(":-)".toList) == false)
  }

  test("())( == false"){
    assert(balance("())(".toList) == false)
  }
}
