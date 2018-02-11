List(1, 2, 3, 4, 5) foreach { i => println("Int :" + i) }

val statCapitals = Map("Alabama" -> "Montgomery", "Alaska" -> "juneau", "Wyoming" -> "Cheyenne")

statCapitals foreach { kv => println(kv._1 + ":" + kv._2) }

statCapitals foreach { case (k, v) => println(k + ":" + v) }