

object TreeFunctions {

	abstract class IntTree
	case object EmptyTree extends IntTree
	case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

    def contains(t: IntTree, v: Int): Boolean = t match { 
    	case EmptyTree => false
    	case Node(`v`, _, _) => true
    	case Node(_, l, r) => contains(l, v) || contains(r, v)
	}

	def insert(t: IntTree, v: Int): IntTree = t match {
		case EmptyTree => new Node(v, EmptyTree, EmptyTree)
		case Node(`v`, _, _) => EmptyTree
		case Node(x, l, r)  => if (x < v) new Node(x, l, insert(r, v)) else new Node(x, insert(l, v), r)
	}

    //def main(args: Array[String]) = println("factorial of 4=" + factorial(4))
}