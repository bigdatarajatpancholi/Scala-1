import java.util.Scanner

object ifelsedemo {
  def main(args :Array[String]): Unit = {
    val x=50
    var res = ""
     val input = readLine("please type integers only ").toInt

    if (x == input) {
      res = "valid input"
   //   println("x==50")
    } else {
      res = "invalid input"
   //   println("x not equal to 50")
    }
    print (res,input)
  }

}
