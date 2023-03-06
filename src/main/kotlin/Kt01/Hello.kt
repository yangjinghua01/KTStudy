package Kt01

import Country
import CountryApp
import CountryTest
import filterCountries
import jdk.nashorn.internal.objects.Global.print

fun main() {
    var hello: String = "Hello World"
    print(hello)
    val name: String = "jack"
    print(name)
    val countryApp = CountryApp()
    val countryTest = CountryTest()
//    countryApp.filterCoutries(countries =, fun(country: Country): Boolean {
//        return country.continient == "EU" && country.population > 10000
//    })
    val sum:(Int,Int)->Int={
        a:Int,b:Int ->a+b
    }
    val sums ={x:Int,y:Int->x+y}
    fun foo(int: Int) ={
        print(int)
    }

    /**
     * fun在没有等号只有花括号的情况下，是我们最常见的代码块函数体，如果返回非Unint值，必须带return
     */
//    Unit类型
    fun foo1(x:Int){
    print(x)}
//    单表达式
    fun foo2(x:Int,y:Int):Int{
        return x*y
    }
    //fun带等号，是单表达式函数体，该情况下可以省略reture
    fun food(x:Int,y:Int) =x+y


}