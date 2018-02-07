// stripMargin 和 | 搭配能去掉多余的空格
val s =
  """Welcome!
        Hello, Programming scala!
        * "Gratuitous Star!!"
        |We're glad you're here.
        |    Have some extra whitespace.
  """.stripMargin

println(s)

val s1 = """xxxHello, Worldyyy""".stripPrefix("xxx").stripSuffix("yyy")

println(s1)