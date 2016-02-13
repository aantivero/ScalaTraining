package progfun.week1

import org.scalatest.FunSuite

/**
  * Created by alex on 13/02/2016.
  */
class PascalTriangleSuite extends FunSuite{

  import ExerciseW1.pascal

  test("pascal(1, 2) = 1") {
    assert(pascal(1, 2) == 1)
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
