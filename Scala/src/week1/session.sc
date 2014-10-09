import org.scalacheck.{Prop, Properties}
object session extends Properties("Session") {
  class SquareRootExample {
    def abs(x: Double) = if (x < 0) -x else x
    def sqrt(x: Double) = {

      def sqrtIter(guess: Double): Double =
        if (isGoodEnough(guess)) guess
        else sqrtIter(improve(guess))

       def isGoodEnough(guess: Double) =
          abs(guess * guess - x) <= math.ulp(x)

      def improve(guess: Double) =
        (guess + x / guess) / 2
       sqrtIter(1.0)
    }
  }

  val properties =
    Prop.forAll { (x: Double) =>
      if (x <= 0) {
        true
      } else {
        val session = new SquareRootExample
        val sqrtResult = session.sqrt(x)

        println(s"x: $x\nsqrtResult: $sqrtResult\n\n")

        sqrtResult * sqrtResult == x
      }
    }
  properties.check






















}
