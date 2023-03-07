import java.awt.Color

class Bird1(weight: Double = 0.00, age: Int = 0, color: String = "blue") {
    val weight: Double
    val age: Int
    val color: String

    init {
        this.age = age
        this.color = color
        this.weight = weight
    }
}