package com.scala

/**
 * {@code @description:} ${description}
 */
object LazyMain {
  def main(args: Array[String]): Unit = {
    def hello(): String = {
      "hello"
    }
    
    val h = hello()
    
    // val hello: () => String = () => "Hello"
    //
    // val h = hello
    
    
    println("before")
    // println(h())
    println("after")
  }
}
