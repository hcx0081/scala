package com.scala.clzAndObj

object Diamond {
  def main(args: Array[String]): Unit = {
    val myBall = new MyBall
    println(myBall.desc()) // my ball is red - foot - ball
  }
  
  trait Ball {
    def desc(): String = "ball"
  }
  
  trait ColorBall extends Ball {
    override def desc(): String = "red" + " - " + super.desc()
  }
  
  trait CategoryBall extends Ball {
    override def desc(): String = "foot" + " - " + super.desc()
  }
  
  class MyBall extends CategoryBall with ColorBall {
    override def desc(): String = "my ball is " + super.desc()
  }
}
