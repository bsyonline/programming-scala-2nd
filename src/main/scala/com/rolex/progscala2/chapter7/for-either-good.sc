def positive(i: Int): Either[String, Int] = if (i > 0) Right(i) else Left(s"nonpositive number $i")

for {
  i1 <- positive(5).right // 5
  i2 <- positive(10 * i1).right // 50
  i3 <- positive(25 * i2).right // 1250
  i4 <- positive(2 * i3).right // 2500
} yield (i1 + i2 + i3 + i4) // 3805

for {
  i1 <- positive(5).right // 5
  i2 <- positive(-1 * i1).right // -5
  i3 <- positive(25 * i2).right //
  i4 <- positive(-2 * i3).right //
} yield (i1 + i2 + i3 + i4) //

// 定义 Either 对象
val l: Either[String, Int] = Left("boo")

val r: Either[String, Int] = Right(12)

// 另一种方式定义 Either 对象
val l1: String Either Int = Left("boo")

// 定义别名
type Or[A, B] = Either[A, B]

val l2: String Or Int = Left("boo")

val res2 = l.left
val res3 = l.right

val res4 = l.left.map(_.size)
val res6 = l.right.map(_.toDouble)

val res5 = r.left.map(_.size)
val res7 = r.right.map(_.toDouble)

val res8 = l.left map (_.size)
val res9 = for (s <- l.left) yield s.size

