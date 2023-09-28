package com.scala

/**
 * {@code @description:} ${description}
 */
object LazyMain {
  def main(args: Array[String]): Unit = {
    def hello(): Unit = {
      println("hello")
    }
    
    val h = hello _
    
    println("before")
    println(h())
    println("after")
  }
}
