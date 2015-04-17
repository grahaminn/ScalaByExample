package org.grahaminn.scalastudy;

import org.scalatest.FlatSpec
import org.scalatest._

abstract class UnitSpec extends FlatSpec with Matchers with OptionValues with Inside with Inspectors

class SetSpec extends UnitSpec {
  val setA = new NonEmptySet(1, new NonEmptySet(2, new EmptySet, new EmptySet), new EmptySet)
  val setB = new NonEmptySet(2, new EmptySet, new NonEmptySet(3, new EmptySet, new EmptySet))
  val setC = new NonEmptySet(2, new NonEmptySet(1, new EmptySet, new EmptySet), new NonEmptySet(3, new EmptySet, new EmptySet))

  "The intersection of Set A and Set B" should " only contain 2" in {
    val setD = (setA intersection setB)
    assert(!(setD contains 1))
    assert(setD contains 2)
    assert(!(setD contains 3))
  }

  "The union of Set A and Set B" should "contain 1, 2 and 3" in {
    val setD = (setA union setB)
    assert(setD contains 1)
    assert(setD contains 2)
    assert(setD contains 3) 
  }
  
  "The intersection of Set B and Set C" should "not contain 1 and contain 2 and 3" in {
    val setD = (setB intersection setC)
    assert(!(setD contains 1))
    assert(setD contains 2)
    assert(setD contains 3)
  } 
}
