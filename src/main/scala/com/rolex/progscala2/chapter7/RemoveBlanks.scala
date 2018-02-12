package com.rolex.progscala2.chapter7

import scala.io.Source

/**
  * Created by Rolex on 02/11/2018.
  */
object RemoveBlanks {

  def apply(path: String, compressWhiteSpace: Boolean = false): Seq[String] =
    for {
      line <-  Source.fromFile(path).getLines().toSeq
      if line.matches("""^\s*$""") == false
      line2 = if (compressWhiteSpace) line replaceAll("\\s+", "[blank]") else line
    } yield line2

  /*
  sbt> run-main src\main\scala\com\rolex\progscala2\chapter7\RemoveBlanks.scala
   */
  def main(args: Array[String]) = for {
    path2 <- args
    (compress, path) = if (path2 startsWith "-") (true, path2.substring(1)) else (false, path2)
    line <- apply(path, compress)
  } println(line)

}
