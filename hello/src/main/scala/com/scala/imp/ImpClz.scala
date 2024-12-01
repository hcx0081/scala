package com.scala.imp

object ImpClz {
  def main(args: Array[String]): Unit = {
    println(10.myMax(0)) // 10
  }
  
  implicit class MyInt(val num: Int) {
    def myMax(n: Int): Int = if (num > n) num else n
    
    def myMin(n: Int): Int = if (num > n) n else num
  }
}
