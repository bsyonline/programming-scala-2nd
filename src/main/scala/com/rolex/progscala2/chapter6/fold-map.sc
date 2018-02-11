val list = List("Apple", "Pair", "Orange", "Banana", "BlueBerry")
val list1 = (list foldRight List.empty[String]) {
  (x, list) => ("[" + x + "]") :: list
}

val list2 = (list scan "*") (_ + _)

val list3 = (list scanLeft "*") (_ + _)

val list4 = (list scanRight "*") (_ + _)

val res1 = List(1, 2, 3, 4, 5) product

val res2 = list mkString

val res3 = list mkString (",")

val res4 = list mkString("[", ",", "]")

val list5 = (List(1, 2, 3, 4, 5) scan 10) (_ + _)
