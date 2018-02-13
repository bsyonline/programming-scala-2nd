package com.rolex.progscala2.chapter8

/**
  * Created by rolex on 2/13/18.
  */
object ValueClassDollar {

  def main(args: Array[String]): Unit = {
    val benjamin = new Dollar(100)
    println(benjamin)
  }

}
class Dollar(val value: Float) extends AnyVal {
  override def toString = "$%.2f".format(value)
}

