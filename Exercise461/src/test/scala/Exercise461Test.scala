import org.scalatest.FunSuite

import Factorial._

/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
class FunSetSuite extends FunSuite {
	test("Should work out a factorial") {
		assert(Factorial.factorial(9) == 362880)
	}
}