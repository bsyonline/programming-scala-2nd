val t = ("hello", 1, 2.3)
println("tuple = ", t)
println("1 item = ", t._1) // 下标从1开始
println("2 item = ", t._2)
println("3 item = ", t._3)

val (t1, t2, t3) = ("world", "!", 0x22)
println(t1 + ", " + t2 + ", " + t3)

val (t4, t5, t6) = Tuple3("world", "!", 0x22) // 使用工厂方法
println(t4 + ", " + t5 + ", " + t6)

// 2个元素的元组也叫pair
val t7 = Tuple2(1, "one")
val t8 = (1, "one")
val t9 = 1 -> "one"
