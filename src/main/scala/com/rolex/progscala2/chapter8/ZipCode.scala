package com.rolex.progscala2.chapter8

/**
  * Created by rolex on 2/13/18.
  */
case class ZipCode(zip: Int, extension: Option[Int] = None) {
  require(valid(zip, extension), s"Invalid zip+4 specified: $toString")

  protected def valid(z: Int, e: Option[Int]): Boolean = {
    if (0 < z && z <= 99999) e match {
      case None => validUSPS(z, 0)
      case Some(e) => 0 < e && e <= 9999 && validUSPS(z, e)
    }
    else false
  }

  protected def validUSPS(i: Int, e: Int): Boolean = true

  override def toString: String = if (extension != None) s"$zip-${extension.get}" else zip.toString
}

object ZipCode {
  def apply(zip: Int, extension: Int): ZipCode = new ZipCode(zip, Some(extension))

  def main(args: Array[String]): Unit = {
    val z1 = ZipCode(12345)
    println(z1)
    val z2 = ZipCode(12345, Some(6789))
    println(z2)
    val z3 = ZipCode(12345, 6789)
    println(z3)
    try {
      ZipCode(0, 6789)
    } catch {
      case e: Exception => println(e)
    }
    try {
      ZipCode(12345, 0)
    } catch {
      case e: Exception => println(e)
    }
  }
}
