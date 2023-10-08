package com.scala.imp

object ImpParam {
  def main(args: Array[String]): Unit = {
    implicit val str: String = "zs"

    // def sayHi()(implicit name: String = "ls"): Unit = {
    //   println(s"hello, $name!")
    // }
    //
    // sayHi()
    def sayHi(): Unit = {
      println(s"hello, ${implicitly[String]}!")
    }

    sayHi()
  }
}
