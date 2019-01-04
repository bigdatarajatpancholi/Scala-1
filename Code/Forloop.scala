object Forloop {
  def main(args: Array[String]): Unit ={
    for (i <- 1 to 5) {
      print("i is " + i)
    }
    for ( i <- 2.to (5)){
      print("i is using .to" + i)
    }
    for (i <- 1.until(6)){
      print("i is using .until "+ i)
    }
    for (i <- 1 to 3 ; j <- 4 to 7){
      print("using multiple condition "+ i + j)
    }
    val lst=List(1,2,3,4,5,6,7,8,9)
    val x= for {i <-  lst ; if i < 6} yield {
      i * i
    }
      print("result" + x)

  }

}
