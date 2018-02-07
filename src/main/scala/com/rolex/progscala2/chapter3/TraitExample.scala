package com.rolex.progscala2.chapter3

/**
  * Created by rolex on 5/27/17.
  */
object ServiceImportante {
  def main(args: Array[String]): Unit = {
    val service1 = new ServiceImportante("uno")
    (1 to 3) foreach (i => println(s"Result: ${service1.work(i)}"))
    println("--------------------------------------------------")
    val service2 = new ServiceImportante("dos") with StdoutLogging {
      override def work(i: Int): Int = {
        info(s"Stringing work: i = $i")
        val result = super.work(i)
        info(s"Ending work: i = $i, result = $result")
        result
      }
    }
    (1 to 3) foreach (i => println(s"Result: ${service2.work(i)}"))
    println("--------------------------------------------------")
    val service3 = new LoggedServiceImportante("t")
    (1 to 3) foreach (i => println(s"Result: ${service3.work(i)}"))
  }
}

class ServiceImportante(name: String) {
  def work(i: Int) = {
    println(s"ServiceImportante: Doing important work! $i")
    i + 1
  }

}

trait Logging {
  def info(message: String): Unit

  def warning(message: String): Unit

  def error(message: String): Unit
}

trait StdoutLogging extends Logging {
  def info(message: String): Unit = println(s"INFO: $message")

  def warning(message: String): Unit = println(s"WARN: $message")

  def error(message: String): Unit = println(s"ERROR: $message")
}

class LoggedServiceImportante(name: String) extends ServiceImportante(name : String) with StdoutLogging{
  override def work(i: Int): Int = {
    info(s"Stringing work: i = $i")
    val result = super.work(i)
    info(s"Ending work: i = $i, result = $result")
    result
  }
}