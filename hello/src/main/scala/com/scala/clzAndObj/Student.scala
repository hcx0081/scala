package com.scala.clzAndObj

class Student(name: String, age: Int) {
  def printInfo(): Unit = {
    println(this.name + " " + this.age + " " + Student.school)
  }
}

object Student {
  val school: String = "xmu"
  
  def main(args: Array[String]): Unit = {
    val zs = new Student("zs", 20)
    val ls = new Student("ls", 22)
    zs.printInfo()
    ls.printInfo()
  }
}
