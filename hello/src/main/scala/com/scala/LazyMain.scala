package com.scala

/**
 * {@code @description:} ${description}
 */
class LazyMain {
  println("foo before")
  // 延迟加载
  lazy val foo: String = initFoo()
  println("foo after")

  println("bar before")
  val bar: String = initBar()
  println("bar after")

  def initFoo(): String = {
    println("initFoo exec")
    "foo"
  }

  def initBar(): String = {
    println("initBar exec")
    "bar"
  }
}


object LazyMain {
  def main(args: Array[String]): Unit = {
    val lazyMain = new LazyMain
    println(lazyMain.foo)
    println(lazyMain.bar)
    // foo before
    // foo after
    // bar before
    // initBar exec
    // bar after
    // initFoo exec
    // foo
    // bar
  }
}
