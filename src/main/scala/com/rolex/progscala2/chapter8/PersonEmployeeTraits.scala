package com.rolex.progscala2.chapter8

/**
  * Created by rolex on 2/13/18.
  */
case class Address(street: String, city: String, state: String, zip: String)

object Address {
  def apply(zip: String) = new Address("[Unknown]", Address.zipToCity(zip), Address.zipToState(zip), zip)

  def zipToCity(zip: String) = "Anytown"

  def zipToState(zip: String) = "CA"
}

trait PersonState {
  val name: String
  val age: Option[Int]
  val address: Option[Address]
}

case class Person(name: String, age: Option[Int] = None, address: Option[Address] = None) extends PersonState

trait EmployeeState {
  val title: String
  val manager: Option[Employee]
}

case class Employee(name: String, age: Option[Int], address: Option[Address] = None, title: String, manager: Option[Employee] = None) extends PersonState with EmployeeState

object PersonEmployeeTraits {
  def main(args: Array[String]): Unit = {
    val a1 = Address("12345-6789")
    val ceo = Employee(name = "Joe CEO", title = "CEO", age = Some(50), address = Some(a1), manager = None)
    val ceoSpouse = Person("Jane Smith", address = Some(a1))
    val buck = Employee(name = "Buck Trends", title = "Dev", age = Some(20), address = Some(a1), manager = Some(ceo))
    val buckSpouse = Person("Ann Collins", address = Some(a1))
    println(ceo)
    println(ceoSpouse)
    println(buck)
    println(buckSpouse)
  }
}