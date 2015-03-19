package org.grahaminn.scalastudy

trait IntSet {
    def incl(x: Int): IntSet
    def contains(x: Int): Boolean
    def union(x: IntSet): IntSet
    def intersection(x: IntSet): IntSet
}

class EmptySet extends IntSet {
    def contains(x: Int): Boolean = false
    def incl(x: Int): IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)
    def union(x: IntSet): IntSet = x
    def intersection(x: IntSet) : IntSet = this
}

class NonEmptySet(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  def incl(x: Int): IntSet =
    if (x < elem) new NonEmptySet(elem, left incl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right incl x)
    else this
  def union(x: IntSet): IntSet = 
    if (x contains elem) ((x union left) union right)
    else new NonEmptySet(elem, x union left, x union right)
  def intersection(x: IntSet) : IntSet =
    if (x contains elem) new NonEmptySet(elem, x intersection right, x intersection left)
    else return ((x intersection left) intersection right) 
}
