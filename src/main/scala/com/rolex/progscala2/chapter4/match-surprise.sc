def checkY(y: Int) = {
  for {
    x <- Seq(99, 100, 101)
  } {
    val str = x match {
      //case y => "find y" // y 匹配所有的输入，所以永远服无法到达下一个case
      case _: Int => println(s"int : $x")
    }
    println(str)
  }
}
checkY(100)

def checkY1(y: Int) = {
  for {
    x <- Seq(99, 100, 101)
  } {
    val str = x match {
      case `y` => "find y" // 如果想匹配checkY1的方法参数，加上反引号
      case _: Int => s"int : $x"
    }
    println(str)
  }
}
checkY1(100)

def checkY2(y: Int) = {
  for {
    x <- Seq(99, 100, 101)
  } {
    val str = x match {
      case `y` => "found y!"           // The only change: `y`
      case i: Int => "int: "+i
    }
    println(str)
  }
}
checkY2(100)