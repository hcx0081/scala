package com.scala.func

object Trans {
  def main(args: Array[String]): Unit = {
    /* 作为值传递 */
    // def func(): String = {
    //   println("func")
    //   String.valueOf(2)
    // }
    //
    // // 两种方式
    // val result1: () => String = func
    // val result2 = func _
    //
    // println(result1())
    // println(result2())
    //
    // // -----------
    // def func(n: Int): String = {
    //   println("func")
    //   String.valueOf(n * 2)
    // }
    //
    // // 两种方式
    // val result1: Int => String = func
    // val result2 = func _
    //
    // println(result1(2))
    // println(result2(2))
    //
    //
    // // -----------
    // def func(n: Int, m: Int): String = {
    //   println("func")
    //   String.valueOf(n * m * 2)
    // }
    //
    // // 两种方式
    // val result1: (Int, Int) => String = func
    // val result2 = func _
    //
    // println(result1(2, 2))
    // println(result2(2, 2))
    
    
    /* 作为参数传递 */
    def func(f: (Int, Int) => Int, a: Int, b: Int): Int = {
      f(a, b)
    }
    
    // 以上函数可以接收以下函数作为参数
    def add(a: Int, b: Int): Int = a + b
    
    def sub(a: Int, b: Int): Int = a - b
    
    def mul(a: Int, b: Int): Int = a * b
    
    println(func(add, 1, 2)) // 3
    println(func(_ + _, 1, 2)) // 3
    
    
    /* 作为其他函数的返回值进行返回 */
    // def func(): Int => String = {
    //   def f(n: Int): String = {
    //     String.valueOf(n)
    //   }
    //
    //   f
    // }
    //
    // println(func()(0)) // 0
  }
}
