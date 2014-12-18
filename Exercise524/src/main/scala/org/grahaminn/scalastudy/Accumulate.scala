package org.grahaminn.scalastudy

object Accumulate {
  def accumulate(f: Int => Int) (g: (Int, Int) => Int) (origin:Int, a: Int, b: Int): Int = {
    def iter(a: Int, result: Int): Int = {
      if (a > b) result
      else iter (a+1, g(result,  f(a)))
    }
    iter(a, origin)
  }
  
  def main(args: Array[String]) = {
    println("sum between 1 and 4=" + accumulate(x=>x)((x,y)=>(x+y))(0, 1, 4))
    println("product of 1 to 4=" + accumulate(x=>x)((x,y)=>(x*y))(1,1,4))

  }
}



