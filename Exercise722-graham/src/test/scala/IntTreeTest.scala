package org.grahaminn.scalastudy;

import org.scalatest.FlatSpec
import org.scalatest._

abstract class UnitSpec extends FlatSpec with Matchers with OptionValues with Inside with Inspectors

class IntTreeSpec extends UnitSpec {
  val IntTreeA = new Node(1, EmptyTree, EmptyTree)
  val IntTreeB = new Node(1, EmptyTree, new Node(2, EmptyTree, EmptyTree))
  val IntTreeC = new Node(1, EmptyTree, new Node(2, EmptyTree, new Node(3, EmptyTree, EmptyTree)))

  "IntTreeA " should " contain 1" in {
    assert(IntTreeA contains 1);
    assert(!(IntTreeA contains 2))
    assert(!(IntTreeA contains 3))
  }

  "Inserting 1 into IntTreeA" should " contain 1" in {
	val test = IntTreeA insert 1
	assert(test contains 1)
	assert(test == IntTreeA)
   }

  "Inserting 2 into IntTreeA" should "contain 1 and 2" in {
    val test3 = (IntTreeA insert 2)
    assert(test3 contains 1)
    assert(test3 contains 2)
    assert(test3 == IntTreeB) 
  }

  "Inserting 3 into IntTree B" should "contain 1, 2 and 3" in {
	val test = (IntTreeB insert 3)
	assert(test contains 1)
	assert(test contains 2)
	assert(test contains 3)
	assert(test == IntTreeC)
   }
}
