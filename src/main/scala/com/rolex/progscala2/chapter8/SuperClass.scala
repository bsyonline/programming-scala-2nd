package com.rolex.progscala2.chapter8

import java.io.File

import scala.io.Source

/**
  * Created by rolex on 2/13/18.
  */
abstract class BulkReader {
  type In
  val source: In

  def read: String
}

class StringBulkReader(val source: String) extends BulkReader {
  type In = String

  def read: String = source
}

class FileBulkReader(val source: File) extends BulkReader {
  type In = File

  def read: String = ""
}
