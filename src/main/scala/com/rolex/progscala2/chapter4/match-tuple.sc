val langs = Seq(
  ("Scala", "Martin", "Odersky"),
  ("Clojure", "Rich", "Hickey"),
  ("Lisp", "John", "McCarthy")
)

for (tuple <- langs) {
  tuple match {
    case ("Scala", _, _) => println("found scala")
    case (lang, first, last) =>
      println(s"Found other language: $lang($first,$last)")
  }
}

val itemsCosts = Seq(("Pencil", 0.52), ("Paper", 1.35), ("Notebook", 2.43))
val zipWithIndices = itemsCosts.zipWithIndex
for (zipWithIndex <- zipWithIndices) {
  zipWithIndex match {
    case ((item, cost), index) => println(s"$index : $item costs $cost")
  }
}