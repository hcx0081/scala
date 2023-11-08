package com.scala.collection

import scala.collection.mutable.ListBuffer

object CollectionMain {
  def main(args: Array[String]): Unit = {
    val list = ListBuffer(1, 2, 3)
    println(list drop 1)
    println(list)
  }
}
