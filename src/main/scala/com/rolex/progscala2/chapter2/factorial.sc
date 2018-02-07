import scala.annotation.tailrec

def factorial(i: Int) = {
  // 递归方法不必须声明返回类型,因为 scala 局部类型推断无法推倒出递归方法的返回类型

  @tailrec
  def fact(i: Int, accumulator: Int): Long = {
    if (i <= 1) accumulator
    else fact(i - 1, i * accumulator)
  }

  fact(i, 1)
}

(0 to 5) foreach (i => println(factorial(i)))