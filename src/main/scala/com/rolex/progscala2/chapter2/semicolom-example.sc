// 在 scala 命令行中代码换行可用 等号= 左大括号{ 逗号, 点. 操作符
def equalsign(s: String) =
  println("equalsign: " + s)

equalsign("hello")

def equalsign2(s: String): Unit = {
  println("equalsign: " + s)
}

equalsign2("world")

def commas(s1: String,
           s2: String) = Console.
  println("commas: " + s1 +
    "," + s2)

commas("hello", "world")