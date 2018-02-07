import java.io.File

val configFile = new File("config")
// if 语句有返回值，可赋值给其他变量
val foo=if(configFile.exists()){
  configFile.getAbsolutePath
}else{
  "config file not found"
}

foo
