package org.grahaminn.scalastudy;

import org.scalatest.FlatSpec
import org.scalatest._

abstract class UnitSpec extends FlatSpec with Matchers with OptionValues with Inside with Inspectors

class SetSpec extends UnitSpec {
  val setA = new NonEmptySet(1, new NonEmptySet(2, new EmptySet, new EmptySet), new EmptySet)
  val setB = new NonEmptySet(2, new EmptySet, new NonEmptySet(3, new EmptySet, new EmptySet))
   

  "The intersection of Set A and Set B" should " only contain 2" in {
    val setC = (setA intersection setB)
    assert(!(setC contains 1))
    assert(setC contains 2)
    assert(!(setC contains 3))
  }

  "The union of Set A and Set B" should "contain 1, 2 and 3" in {
    val setC = (setA union setB)
    assert(setC contains 1)
    assert(setC contains 2)
    assert(setC contains 3) 
  }
}
