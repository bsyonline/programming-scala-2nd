def foo(i: Int): Boolean = i < 10

var flag = true
var i = 0
while (flag) {
  println(i)
  i += 1
  flag = i < 10
}