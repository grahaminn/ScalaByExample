package org.grahaminn.scalastudy


object Factorial {
  def factorial (a: Int): Int = {
    Product.product(x=>x) (1, a)
  }

  def main(args: Array[String]) = {
    println(Factorial.factorial(7))
  }

}



