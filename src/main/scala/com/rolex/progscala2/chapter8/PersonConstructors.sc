case class Address(street: String, city: String, state: String, zip: String) {
  def this(zip: String) =
    this("[Unknown]", Address.zipToCity(zip), Address.zipToState(zip), zip)
}

object Address {
  def zipToCity(zip: String) = "AnyTown"

  def zipToState(zip: String) = "CA"
}

case class Person(name: String, age: Option[Int], address: Option[Address]) {
  def this(name: String) = this(name, None, None)

  def this(name: String, age: Int) = this(name, Some(age), None)

  def this(name: String, age: Int, address: Address) = this(name, Some(age), Some(address))

  def this(name: String, address: Address) = this(name, None, Some(address))
}

val a1 = new Address("1 Scala Lane", "Anytown", "CA", "98765")

val a2 = new Address("98765")

val p1 = new Person("Buck Trends")

val p2 = new Person("Buck Trends", 20)

val p3 = new Person("Buck Trends", 20, a1)

val p4 = new Person("Buck Trends", a1)

class Person2(name: String, age: Option[Int] = None, address: Option[Address] = None)

val p11 = new Person2("Buck Trends")

val p12 = new Person2("Buck Trends", Some(20))

val p13 = new Person2("Buck Trends", Some(20), Some(a1))

val p14 = new Person2("Buck Trends", address = Some(a1))

object Person2 {
  def apply(name: String): Person2 = new Person2(name)

  def apply(name: String, age: Int): Person2 = new Person2(name, Some(age))

  def apply(name: String, age: Int, address: Address): Person2 = new Person2(name, Some(age), Some(address))

  def apply(name: String, address: Address): Person2 = new Person2(name, address = Some(address))
}

val p21 = Person2("Buck Trends")

val p22 = Person2("Buck Trends", 20)

val p23 = Person2("Buck Trends", 20, a1)

val p24 = Person2("Buck Trends", a1)