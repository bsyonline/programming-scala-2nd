// 偏函数,病不处理所有可能的输入,只处理能与至少一个 case 语句匹配的输入
// 偏函数中是能使用 case 语句, 只能使用大括号包围
val pf1: PartialFunction[Any, String] = {
  case s: String => "YES"
}
val pf2: PartialFunction[Any, String] = {
  case d: Double => "YES"
}

// 使用 orElse 进行链式链接,从左到右匹配,全都不匹配抛出 MatchError
val pf = pf1 orElse pf2

def tryPF(x: Any, f: PartialFunction[Any, String]): String =
  try {
    f(x).toString
  } catch {
    case _: MatchError => "ERROR"
  }


// 使用 isDefinedAt 测试输入是否匹配, 避免抛出异常
def d(x: Any, f: PartialFunction[Any, String]) = f.isDefinedAt(x).toString


print("      |  fp - String   |  pf - Double   |   pf - All      ")
print("  x   | def?  | pf1(x) | def?  | pf2(x) | def?  | pf(x)   ")
print("--------------------------------------------------------- ")
List("str", 3.14, 10) foreach { x =>
  printf(" %-5s| %-5s | %-6s | %-5s | %-6s | %-5s | %-6s\n", x.toString,
    d(x, pf1), tryPF(x, pf1),
    d(x, pf2), tryPF(x, pf2),
    d(x, pf2), tryPF(x, pf2)
  )
}

