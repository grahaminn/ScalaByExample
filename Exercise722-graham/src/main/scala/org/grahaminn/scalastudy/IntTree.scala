package org.grahaminn.scalastudy;

abstract class IntTree {
	def contains(v: Int): Boolean = this match {
        	case EmptyTree => false
        	case Node(node, left, right) => ((node == v) || (left contains v) || (right contains v))
	}

	def insert(v: Int): IntTree = this match {
        	case EmptyTree => new Node(v, EmptyTree, EmptyTree)
        	case Node(node, left, right) =>
                	if (v < node) { new Node(node, left insert v, right) }
			else if (v == node) return this
                	else { new Node (node, left, right insert v) }
	}
}

case object EmptyTree extends IntTree
case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree
