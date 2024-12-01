package com.scala.imp


object ImpFunc {
  def main(args: Array[String]): Unit = {
    // val myInt = new MyInt(10)
    // println(myInt.myMax(0)) // 10
    
    implicit def conv(num: Int): MyInt = new MyInt(num)
    
    println(10.myMax(0)) // 10
  }
}

class MyInt(val num: Int) {
  def myMax(n: Int): Int = if (num > n) num else n
  
  def myMin(n: Int): Int = if (num > n) n else num
}
