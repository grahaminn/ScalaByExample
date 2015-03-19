package org.grahaminn.scalastudy;

import org.scalatest._

abstract class UnitSpec extends FlatSpec with Matchers with OptionValues with Inside with Inspectors

class SetSpec extends UnitSpec {
  "The intersection of Set A and Set B" should "contain 2" in {
    val setA = new NonEmptySet(1, new NonEmptySet(2, new EmptySet, new EmptySet), new EmptySet)
    val setB = new NonEmptySet(2, new EmptySet, new NonEmptySet(3, new EmptySet, new EmptySet))
    (setA intersect setB) should be (new NonEmptySet(2, new EmptySet, new EmptySet))
  }
}
