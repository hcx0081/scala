package com.scala.string

object Str {
  def main(args: Array[String]): Unit = {
    println(s"2 + 2 = ${2 + 2}") // 2 + 2 = 4
    
    val x = -1
    println(s"x.abs = ${x.abs}") // x.abs = 1
    
    println(
      """The essence of Scala:
                   Fusion of functional and object-oriented
                   programming in a typed setting.""")
    // The essence of Scala:
    //                    Fusion of functional and object-oriented
    //                    programming in a typed setting.
    
    println(
      """The essence of Scala:
        |Fusion of functional and object-oriented
        |programming in a typed setting.""".stripMargin)
    // The essence of Scala:
    // Fusion of functional and object-oriented
    // programming in a typed setting.
  }
}

