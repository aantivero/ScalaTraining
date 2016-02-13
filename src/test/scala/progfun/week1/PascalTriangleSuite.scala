package progfun.week1

import org.scalatest.FunSuite

/**
  * Created by alex on 13/02/2016.
  */
class PascalTriangleSuite extends FunSuite{

  import ExerciseW1.pascal

  test("pascal(col 0, row 2) == 1") {
    assert(pascal(0, 2) == 1)
  }

  test("pascal(col 1, row 2) == 2") {
    assert(pascal(1, 2) == 2)
  }

  test("pascal(col 1, row 3) == 3") {
    assert(pascal(1, 3) == 3)
  }

}
/*
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
1 5 10 10 5 1
 */
