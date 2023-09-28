package com.scala

import scala.annotation.tailrec

/**
 * {@code @description:} ${description}
 */
object FactMain {
  def main(args: Array[String]): Unit = {
    // def factorial(n: Int): Int = {
    //   if (n <= 1) return 1
    //   factorial(n - 1) * n
    // }
    
    def factorial(n: Int): Int = {
      @tailrec
      def loop(num: Int, acc: Int): Int = {
        if (num <= 1) return acc
        loop(num - 1, num * acc)
      }
      
      loop(n, 1)
    }
  }
}
