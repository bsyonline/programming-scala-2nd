import scala.annotation.tailrec
// @tailrec 用来检查尾递归, 如果不是编译报错
@tailrec
def fibonacci(i: Int): Long = {
  if (i <= 1) 1L
  else fibonacci(i - 2) + fibonacci(i - 1)
}

(0 to 10) foreach (i => println(fibonacci(i)))