package com.scala.func

object Param {
  def main(args: Array[String]): Unit = {
    // def func(f: (Int, Int) => Int, a: Int, b: Int): Int = {
    //   f(a, b)
    // }
    //
    // // 以上函数可以接收以下函数作为参数
    // def add(a: Int, b: Int): Int = a + b
    // def sub(a: Int, b: Int): Int = a - b
    // def mul(a: Int, b: Int): Int = a * b
    //
    // println(func(add, 1, 2)) // 3
    // println(func(_ + _, 1, 2)) // 3
    
    
    // def addByValue(a: Int, b: Int): Int = a + b
    //
    // println(addByValue(1, 2 + 2)) // 5
    //
    // def addByName(a: Int, b: => Int): Int = a + b
    //
    // println(addByName(1, 2 + 2)) // 5
    //
    // def addByFunc(a: Int, b: () => Int): Int = a + b
    //
    // println(addByFunc(1, () => 2 + 2)) // 5
    
    
    def addByName(a: => Int): Int = a
    
    println(addByName {
      2 + 2
    }) // 5
  }
}
