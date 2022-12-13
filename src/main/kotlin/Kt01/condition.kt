package Kt01

fun main() {
    val age = 4;
    if (age in 0..3) {
        print("婴幼儿")
    } else if (age in 3..12) {
        print("少儿")
    } else {
        print("青少年")
    }
    val school = "小学"
    val level: Any = when (school) {
        "学前班" -> "幼儿"
        "小学" -> "少儿"
        "中学" -> "青少年"
        else -> {
            print("未知")
        }
    }

}