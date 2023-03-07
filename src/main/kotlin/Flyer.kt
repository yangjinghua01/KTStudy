import java.sql.DriverManager.println

interface Flyer {
    val speed: Int
    fun kind()
    fun fly() {
        println("I Can Fly")
    }

    val height
        get() = 1000
}
/**
 * 如果是java
 */
//public interface Flyer{
//    int getSpeed();
//    void kind();
//    public static final class DefaultImpls{
//        public static void fly(Flyer flyer){
//            String var1 = "I Can FLy"
//            System.out.println(var1)
//        }
//    }
//}