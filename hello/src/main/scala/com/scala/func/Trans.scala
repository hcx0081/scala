package com.scala.func

/**
 * {@code @description:} ${description}
 */
object Trans {
  def main(args: Array[String]): Unit = {
    // def func(n: Int): String = {
    //   println("func")
    //   String.valueOf(n * 2)
    // }
    //
    // // 两种方式
    // val result1 = func _
    // val result2: Int => String = func
    //
    // println(result1(2))
    // println(result2(2))
    
    
    def func(): Int => String = {
      def f(n: Int): String = {
        String.valueOf(n)
      }
      
      f
    }
    
    println(func()(0)) //0
  }
}
