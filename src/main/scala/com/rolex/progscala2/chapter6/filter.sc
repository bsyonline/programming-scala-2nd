val stateCapitals = Map("Alabama" -> "Montgomery", "Alaska" -> "juneau", "Wyoming" -> "Cheyenne")

val map1 = stateCapitals filter { kv => kv._1.startsWith("A") }

val map2 = stateCapitals drop (1)

val map3 = stateCapitals dropWhile { kv => kv._1.startsWith("A") }

stateCapitals exists { kv => kv._1.startsWith("A") }

val map4 = stateCapitals filterNot { kv => kv._1.startsWith("A") }

val map5 = stateCapitals find { kv => kv._1.startsWith("A") }

stateCapitals forall { kv => kv._1.startsWith("A") }

val t = stateCapitals partition { kv => kv._1.startsWith("A") }
t._1 foreach { kv => println(kv._1 + ":" + kv._2) }

val map6 = stateCapitals take (2)

val map7 = stateCapitals takeWhile { kv => kv._1.startsWith("A") }



