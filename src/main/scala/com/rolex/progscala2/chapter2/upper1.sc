class Upper {
  def upper(strings: String*): Seq[String] = {
    strings.map((s: String) => s.toUpperCase())
  }
}

val up = new Upper
println(up.upper("hello", "world"))

object Upper1 {
  def upper(strings: String*): Seq[String] = strings.map(_.toUpperCase())
}
println(Upper1.upper("hello", "world"))