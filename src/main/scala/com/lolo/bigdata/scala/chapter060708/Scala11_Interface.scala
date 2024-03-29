package com.lolo.bigdata.scala.chapter060708

/**
  * 特质（接口）
  * scala中没有接口（interface）的概念，有特质（trait）的概念，类似于接口
  */
object Scala11_Interface {

    def main(args: Array[String]): Unit = {

        val user: User11 = new User11()
    }
}

// 声明特质
trait TestTrait11 {

}
trait TestTrait111 {

}

// 特质可以继承，所以使用extends关键字
// 如果类继承多个特质，采用with连接
// 如果类同时存在父类和特质，依然采用继承的方式，但是继承的是父类，连接（混入）特质
class User11() extends TestTrait11 with TestTrait111 {

}
