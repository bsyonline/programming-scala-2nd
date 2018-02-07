import java.applet._ // 导入java.applet包下的所有类
import java.io.File // 静态导入
import java.io.File._ // 导入所有静态属性和方法
import java.util.{ArrayList,HashMap} // 只导入 ArrayList 和 HashMap
import collection.immutable._ // 包路径是相对的
import _root_.scala.collection.mutable._ // 全路径


def stuffWithBigInteger = {
  import java.math.BigInteger.{
    ONE =>_, // 不可见
    TEN,
    ZERO => JAVAZERO // 重命名
  }
  println(TEN)
  println(JAVAZERO)
}