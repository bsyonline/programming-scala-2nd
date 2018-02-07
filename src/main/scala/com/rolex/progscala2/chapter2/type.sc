import scala.collection.immutable.HashMap

val hashmap = new HashMap
// 未初始化的变量必须声明类型
val book: String

// 使用了 return 必须声明类型
def foo(i: String): String = {
  return i
}

// 递归方法必须声明类型
def foo1(i: Int): Int = {
  if (i <= 1) foo1(i)
  else 0
}

// 重载方法调用时,调用的一方必须声明类型
class fn {
  def fn1(i: Int) = i * i

  def fn1(i: Int, j: Int): Int = fn1(i + j)
}

// 推断类型比期望类型更大
def fo(string: String*): List[String] = {
  if (string.length == 0) List(0)
  else string.toList
}
val list: List[String] = fo()
