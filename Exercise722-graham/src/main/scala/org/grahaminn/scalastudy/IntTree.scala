abstract class IntTree {
	def contains(t: IntTree, v: Int): Boolean = t match {
		case EmptyTree => false
		case Node(node, left, right) => 
			(node == v) || contains(left, v) || contains(right, v)
	}

	def insert(t: IntTree, v: Int): IntTree = t match {
		case EmptyTree => Node(v, EmptyTree(), EmptyTree())
		case Node(node, left, right) => 
			if (v < node) new Node(node, insert(left, v), right)
			else new Node (node, left, insert(right, v)
	}
}

case object EmptyTree extends IntTree
case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree
