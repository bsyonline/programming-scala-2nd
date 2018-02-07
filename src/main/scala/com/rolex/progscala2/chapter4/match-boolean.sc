val bools = Seq(true, false)

for (bool <- bools) {
  bool match {
    case true => println("heads")
    case false => println("tails")
  }
}