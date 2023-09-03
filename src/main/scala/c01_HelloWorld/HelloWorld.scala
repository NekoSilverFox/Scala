package c01_HelloWorld

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello world from Scala!")  // Scala 里自带用的 print
    System.out.println("Hello world from Java!")  // 因为 Scala 运行于 JVM，所以可以直接调用 Java 类库
  }
}

