package com.rolex.progscala2.chapter8

/**
  * Created by rolex on 2/13/18.
  */
object USPhoneNumber {
  def main(args: Array[String]): Unit = {
    val number = new USPhoneNumber("987-6543-210")
    println(number)
  }
}
class USPhoneNumber(val s: String) extends AnyVal {
  override def toString: String = {
    val digs = digits(s)
    val areaCode = digs.substring(0, 3)
    val exchange = digs.substring(3, 6)
    val subnumber = digs.substring(6, 10)
    s"($areaCode) $exchange-$subnumber"
  }

  private def digits(str: String): String = str.replaceAll("""\D""", "")
}
