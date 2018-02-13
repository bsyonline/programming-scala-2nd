package com.rolex.progscala2.chapter8

/**
  * Created by rolex on 2/13/18.
  */
trait Digitizer extends Any {
  def digits(s: String): String = s.replaceAll("""\D""", "")
}

trait Formatter extends Any {
  def format(areaCode: String, exchange: String, subnumber: String): String = s"($areaCode) $exchange-$subnumber"
}

class USPhoneNumber1(val s: String) extends AnyVal with Digitizer with Formatter {
  override def toString = {
    val digs = digits(s)
    val areaCode = digs.substring(0, 3)
    val exchange = digs.substring(3, 6)
    val subnumber = digs.substring(6, 10)
    format(areaCode, exchange, subnumber)
  }
}

object USPhoneNumber1 {
  def main(args: Array[String]): Unit = {
    val number = new USPhoneNumber1("987-6543-210")
    println(number)
  }
}