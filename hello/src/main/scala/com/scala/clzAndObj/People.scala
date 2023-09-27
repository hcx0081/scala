package com.scala.clzAndObj

/**
 * {@code @description:} ${description}
 */
class People {
  def hello1(): People = {
    println("hello1")
    this
  }

  def hello2(): People = {
    println("hello2")
    this
  }
}

object People {
  def main(args: Array[String]): Unit = {
    val people = new People
    people hello1() hello2()
  }
}
