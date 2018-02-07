package com.rolex.progscala2.test

import scala.io.Source

/**
  * Created by Rolex on 2018/2/7.
  */
class ReaderTest {

  def readFile(path: String): Unit = {
    val in = Source.fromFile(path)
    in.foreach(print)
  }

  readFile("D:\\Dev\\IdeaProjects\\programming-scala\\build.sbt")
}
