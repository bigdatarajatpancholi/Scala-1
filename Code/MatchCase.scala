object MatchCase {
  def main(args: Array[String]): Unit = {
    val age=readLine("Please insert your age ").toInt

    age match {
      case  20 => print("age is "+ age)
      case  30 => print("age is "+ age)
      case  40 => print("age is "+ age)
      case  50 => print("age is "+ age)
      case  60 => print("age is "+ age)
      case  70 => print("age is "+ age)
      case _ => print("default")
    }
  }
}
