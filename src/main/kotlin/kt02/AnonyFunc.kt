package kt02
//
fun main() {
    val total = "Mississippi".count { l -> l == 's' };
//    println(total)
//    val blessingFuntion:()->String={
//        val holiday = "New Year."
//        "Happy $holiday"
//    }
//    println(blessingFuntion())
//    val blessingFuntion1:(String)->String={
//        name->
//        val holiday = "New Year."
//        "$name Happy $holiday"
//    }
    showOnBoard("111", getDiscontWords)
}
//定义匿名函数
val getDiscontWords = {
    goodsName:String,Hour:Int ->
    "$goodsName 在 $Hour 后 恢复原价"
}
fun showOnBoard(goodsName:String,getDiscontWords:(String,Int)->String){
    val hour:Int = (1..24).shuffled().last()
    println(getDiscontWords(goodsName,hour))

}