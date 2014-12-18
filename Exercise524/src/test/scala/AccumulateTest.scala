import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.grahaminn.scalastudy.Sum

object AccumulateTest extends Properties("Accumulate") {
  // property("accumulate") = forAll { (a: Int, b: Int) => (a to b toList).foldLeft(0)((a,b) => a*b) }
}
