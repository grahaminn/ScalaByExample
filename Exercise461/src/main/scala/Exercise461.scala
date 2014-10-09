object Factorial {

    def factorialIter(n: Int, acc: Int): Int = if (n == 0) acc else factorialIter(n - 1, acc * n)

    def factorial(n: Int): Int = factorialIter(n, 1)

    def main(args: Array[String]) = println("factorial of 4=" + factorial(4))
}
