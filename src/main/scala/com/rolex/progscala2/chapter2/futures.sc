import scala.concurrent.Future
// 在 onSuccess 中包含了隐含参数 ExecutionContext
// 因此如果没有显示的指定,编译器会使用这个声明的值
import scala.concurrent.ExecutionContext.Implicits.global

def sleep(millis: Long) = Thread.sleep(millis)

def doWork(index: Int) = {
  sleep((math.random * 1000).toLong)
  index
}

(1 to 5) foreach { index =>
  val future = Future {
    doWork(index)
  }
  future onSuccess {
    case answer: Int => println(s"Success! returned: $answer")
  }
  future onFailure {
    case th: Throwable => println(s"Failure! returned: $th")
  }
}

sleep(1000)
println("Finito!")