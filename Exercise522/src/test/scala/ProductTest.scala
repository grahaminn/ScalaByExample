import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.grahaminn.scalastudy.Sum

object ProductTest extends Properties("Product") {
  property("product") = forAll { (a: Int, b: Int) => (a to b toList).foldLeft(0)((a,b) => a*b) }
}
