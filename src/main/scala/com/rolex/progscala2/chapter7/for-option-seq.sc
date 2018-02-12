val results: Seq[Option[Int]] = Vector(Some(10), None, Some(20))

val results2 = for {
  Some(i) <- results
} yield (2 * i)

val results3 = for {
  Some(i) <- results withFilter {
    case Some(i) => true
    case None => false
  }
} yield (2 * i)

val result4 = results filter {
  case Some(i) => true
  case None => false
} map {
  case Some(i) => (2 * i)
}