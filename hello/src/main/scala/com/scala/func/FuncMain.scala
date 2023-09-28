package com.scala.func

/**
 * {@code @description:} ${description}
 */
object FuncMain {
  def main(args: Array[String]): Unit = {
    // def func(a: Boolean): Int => String => Char = {
    //   if (a == false) {
    //     def f1(b: Int): String => Char =
    //       if (0 == b) {
    //         def f2(c: String): Char = {
    //           if ("0" == c) {
    //             '0'
    //           } else {
    //             'x'
    //           }
    //         }
    
    //   f2
    // } else {
    //   null
    // }
    
    //     f1
    //   } else {
    //     null
    //   }
    // }
    
    // println(func(false)(0)("0")) // 0
    
    // 等于
    // def func(a: Boolean): Int => String => Char = {
    //   if (a == false) b => if (0 == b) c => if ("0" == c) '0' else 'x' else null else null
    // }
    //
    // println(func(false)(0)("0")) // 0
    
    // 柯里化
    def func(a: Boolean)(b: Int)(c: String): Char = {
      if (a == false) if (0 == b) if ("0" == c) '0' else 'x' else 'x' else 'x'
    }
    
    println(func(false)(0)("0")) // 0
  }
}
