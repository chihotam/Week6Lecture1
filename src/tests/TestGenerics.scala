package tests

import org.scalatest._
import functions.Generics

class TestGenerics extends FunSuite {
  test("") {
    val numlis: List[Int] = List(4,-1,0,3,-2,-5,1)
    val negative: Int => Boolean = (x: Int) => x<0
    val result: List[Boolean] = Generics.genericMethod(numlis, negative)
    assert(result == List(false, true, false, false, true, true, false))
    assert(result != List(true, false, true, true, false, false, true))
  }
}
