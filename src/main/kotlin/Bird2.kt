import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

class Bird2(val weight:Double, val age:Int, val color:String) {
    var sex : String
    init {
        this.sex = if (this.color =="yellow")"male" else "female"
    }
    fun printSex(){
        this.sex = if (this.color == "yellow") "nale" else "female"
        println("Bird2.printSex")
    }

    /**
     * 使用 by lazy 语法 变量必须是不可变的，而不能通过var来声明
     * 在首次调用是才会赋值操作一旦被赋值，后续它将不能被更改
     * lazy 背后是接受一个lambda并返回一个Lazy<T>实例的函数，第一次访问改变量是，会执行lazy对应的lambda表达式并记录结果，后续访问该属性时知识返回记
     * 录的结果
     */
    val  sex2:String by lazy{
        if (color == "yellow") "name" else "female"
    }
}