// val 声明不可变(只读)变量
val array: Array[String] = new Array(5)

// array 指向了一个 Array(5) 对象, 不能指向其他 Array 对象
// array = new Array[String](2)

// array 的元素还是可变的,和 Java 相同
array(0) = "hello"

array


var price: Double = 100d

// 修改的是 price 的值, price 的引用没有变
price = 200D

// 除了作为构造函数参数,变量必须初始化
class Person(val name: String, var age: Int)

val person = new Person("Tom", 20)

//person.name = "jack"

person.age = 21

person.age

// var 和 val 只表示引用是否能改变,不管值是否可变
// 在编程时尽量使用 val 声明变量