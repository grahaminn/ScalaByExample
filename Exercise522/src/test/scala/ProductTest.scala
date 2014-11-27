import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.grahaminn.scalastudy.Product

object ProductTest extends Properties("Product") {
  property("product") = forAll { (a: Int, b: Int) => Product.product(x => x)(a, b) == foldLeft(*, range(a, b)) }
}
