package progfun.week1

import org.scalatest.FunSuite

/**
  * Created by alex on 13/02/2016.
  */
class SetSuite extends FunSuite {

  test("An empty Set Should have size 0"){
    assert(Set.empty.size == 0)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    intercept [NoSuchElementException] {
      Set.empty.head
    }
  }
}
