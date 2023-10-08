package com.scala.clzAndObj

class Cons(var name: String = "zs", var age: Int) {
  def this() {
    this(age = 1)
    println(12)
  }
}

object Cons {
  def main(args: Array[String]): Unit = {
    new Cons()
  }
}
