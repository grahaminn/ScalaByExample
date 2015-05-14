package org.grahaminn.scalastudy;

import org.scalatest.FlatSpec
import org.scalatest._

abstract class UnitSpec extends FlatSpec with Matchers with OptionValues with Inside with Inspectors

class IntTreeSpec extends UnitSpec {
  val IntTreeA = new Node(1, EmptyTree, EmptyTree)
  val IntTreeB = new Node(2, new Node(1, EmptyTree, EmptyTree), EmptyTree)
  val IntTreeC = new Node(2, new Node(1, EmptyTree, EmptyTree), new Node(3, EmptyTree, EmptyTree))

  "IntTreeA " should " contain 1" in {
    assert(IntTreeA contains 1);
    assert(!(IntTreeA contains 2))
    assert(!(IntTreeA contains 3))
  }

  "Inserting 2 into IntTreeA" should "contain 1 and 2" in {
    val test3 = (IntTreeA insert 2)
    assert(test3 contains 1)
    assert(test3 contains 2)
    assert(test3 == IntTreeB) 
  }
}
