package com.scala.func

/**
 * {@code @description:} ${description}
 */
object SimplifyMain {
  def main(args: Array[String]): Unit = {
    def fun(f: String => Unit): Unit = {
      f("hello")
    }
    
    fun((mes: String) => {
      println(mes)
    })
    // 如果编译器能够推断参数类型，可以省略 `: 类型`
    fun((mes) => {
      println(mes)
    })
    // 如果省略 `: 类型`，并且参数列表只有一个参数，那么可以省略 `()`
    fun(mes => {
      println(mes)
    })
    // 如果执行语句只有一行，可以省略花括号 `{}`
    fun(mes => println(mes))
    // 如果参数列表中的每一个参数只出现一次，那么可以省略整个参数列表和 `=>`，并且执行语句中的参数可以按照参数列表中的参数顺序使用通配符 `_` 替代
    fun(println(_))
    // 如果执行语句不是调用语句，那么执行语句中可以省略通配符 `_`
    fun(println)
  }
}
