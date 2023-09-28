package com.scala.clzAndObj

/**
 * {@code @description:} ${description}
 */
class Person {
  private var _name = "zs"
  private var _age = 20
  
  // Getter方法
  def name: String = _name
  
  // Setter方法
  def name_=(newValue: String): Unit = {
    _name = newValue
  }
  
  // Getter方法
  def age: Int = _age
  
  // Setter方法
  def age_=(newValue: Int): Unit = {
    _age = newValue
  }
}
