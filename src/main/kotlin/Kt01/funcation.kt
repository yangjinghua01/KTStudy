package Kt01

import java.sql.DriverManager.println

fun main() {
    dosomeThing(2, false);
    fix("1")
    println("--------------->")
    fix("2", 3)
//    具名函数参数
    fix(age = 44, name = "asdf")
    `~special function with werd name ~`()
}

private fun dosomeThing(age: Int, flag: Boolean): String {
    println("年龄$age")
    return "----"
}

private fun fix(name: String, age: Int = 2) {
    println("$name,$age")
}

fun `~special function with werd name ~`() {
    println("i am weird")
//    TODO用来抛出异常
//    TODO("name exspsion")
}