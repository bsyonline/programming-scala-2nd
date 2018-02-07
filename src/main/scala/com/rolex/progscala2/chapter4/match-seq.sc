val nonEmptySeq = Seq(1, 2, 3, 4, 5)
val emptySeq = Seq.empty[Int]
val nonEmptyList = List(1, 2, 3, 4, 5)
val emptyList = Nil
val nonEmptyVector = Vector(1, 2, 3, 4, 5)
val emptyVector = Vector.empty[Int]
val nonEmptyMap = Map("one" -> 1, "two" -> 2, "three" -> 3)
val emptyMap = Map.empty[String, Int]

// seq 类似链表的结构，由头节点和剩余的节点构成的seq组成，末尾是一个空序列Nil
def seqToString[T](seq: Seq[T]): String = seq match {
  // +: 是序列的构造操作符
  case head +: tail => s"($head +: ${seqToString(tail)})"
  case Nil => "Nil"
}
def seqToString1[T](seq: Seq[T]): String = seq match {
  // 2.10 之前List也用 :: 作为操作符
  case head :: tail => s"($head :: ${seqToString1(tail)})"
  case Nil => "(Nil)"
}

for (seq <- Seq(
  nonEmptySeq, emptySeq, nonEmptyList, emptyList, nonEmptyVector,
  emptyVector, nonEmptyMap.toSeq, emptyMap.toSeq)) {
  println(seqToString(seq))
}
println("---------------------")
for (seq <- List(
  nonEmptyList, emptyList)) {
  println(seqToString1(seq))
}

// 构造List原始对象
val s1 = (1 +: (2 +: (3 +: (4 +: (5 +: Nil)))))
val s2 = (1 :: (2 :: (3 :: (4 :: (5 :: (Nil))))))
val s3 = (("one" -> 1) +: (("two" -> 2) +: (("three" -> 3) +: Nil)))
val s4 = Map(s3: _*)


