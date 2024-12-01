package com.scala.clzAndObj

object Test {
  def main(args: Array[String]): Unit = {
    Per.newPer("zs")
    Per.apply("zs")
    Per("zs")
  }
}

class Per private(name: String) {

}

object Per {
  def newPer(name: String) = new Per(name)
  
  def apply(name: String) = new Per(name)
}
