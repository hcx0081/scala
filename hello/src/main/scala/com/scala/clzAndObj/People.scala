package com.scala.clzAndObj

class People {
  var name: String = _
  var age: Int = _
}

object People {
  def main(args: Array[String]): Unit = {
    val people = new People
    println(people.name)
  }
}
