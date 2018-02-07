val stateCapitals = Map(
  "Alabama" -> "Montgomery",
  "Alaska" -> "Juneau",
  // ...
  "Wyoming" -> "Cheyenne")

println("Get the capitals wrapped in Options:")
println("Alabama: " + stateCapitals.get("Alabama"))
println("Wyoming: " + stateCapitals.get("Wyoming"))
println("Unknown: " + stateCapitals.get("Unknown"))

println("Get the capitals themselves out of the Options:")
println("Alabama: " + stateCapitals.get("Alabama").get)
println("Wyoming: " + stateCapitals.get("Wyoming").getOrElse("Oops!"))
println("Unknown: " + stateCapitals.get("Unknown").getOrElse("Oops2!"))

// Option 用 sealed 修饰, 只能在同一源文件中声明子类, 即限制了 Option 的子类只有 Some 和 None