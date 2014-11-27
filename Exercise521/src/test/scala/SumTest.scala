import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.grahaminn.scalastudy.Sum

object SumTest extends Properties("Sum") {
  property("sum") = forAll { (a: Int, b: Int) => Sum.sum(x => x)(a, b) == (a to b toList).foldLeft(0)((a,b) => a+b) }
}
