import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.grahaminn.scalastudy.Sum

object SumTest extends Properties("Sum") {
  property("sum") = forAll { (a: Int, b: Int) => Sum.sum(x => x)(a, b) == a+b }
}
