package com.scala

package pack1 {

  import com.scala.pack1.pack2.pack3.Inner

  object Outer {
    var out = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
      Inner.in = "out"
      println(Inner.in)
    }
  }

  package pack2 {
    package pack3 {
      object Inner {
        var in = "in"


        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out = "in"
          println(Outer.out)
        }
      }
    }

  }


}

package pack4 {

}
