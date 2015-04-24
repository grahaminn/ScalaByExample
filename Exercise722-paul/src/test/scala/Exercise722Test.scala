import org.scalatest.FunSuite

import TreeFunctions._

/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
class FunSetSuite extends FunSuite {
	// test("Should be able to store and") {
	// 	assert(factorial(9) == 362880)
	// }

	test("Should be able to store and retrive") {
		val set = insert(insert(insert(EmptyTree, 3), 5), 8)

		assert(contains(set, 3))
		assert(!contains(set, 4))
	}
}