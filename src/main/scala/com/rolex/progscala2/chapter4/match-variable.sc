for {
  x <- Seq(1, 2, 2.7, "one", "two", 'four)
} {
  val str = x match {
    case 1 => "int 1"
    case i: Int => "other int : " + i
    case d: Double => "a double : " + d
    case "one" => "string one"
    case s: String => "other string : " + s
    case unexpected => "unexpected value : " + unexpected
  }
  println(str)
}

for {
  x <- Seq(1, 2, 2.7, "one", "two", 'four)
} {
  val str = x match {
    case _ => "int 1"
    case _: Int => "other int : " + x
    case _: Double => "a double : " + x
    case _ => "string one"
    case _: String => "other string : " + x
    case _ => "unexpected value : " + x
  }
  println(str)
}