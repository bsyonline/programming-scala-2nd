package com.rolex.progscala2.chapter8

/**
  * Created by rolex on 2/13/18.
  */
object Database {

  case class ResultSet()

  case class Connection()

  case class DatabaseException(message: String, cause: Throwable) extends RuntimeException

  sealed trait Status

  case object Disconnected extends Status

  case class Connected(connection: Connection) extends Status

  case class QuerySucceed(results: ResultSet) extends Status

  case class QueryFailed(e: DatabaseException) extends Status

}

class Database {

  import Database._

  def connect(server: String): Status = ??? // ??? 为占位符，表示方法尚未实现

  def disconect(): Status = ???

  def query(/*...*/): Status = ???
}
