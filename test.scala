

object test {
  def main(args: Array[String])
  {
    println(" Hello World")
    val a = 10;
    var b = "ramaraj";
    println(a,b)
    //creates a range between 1 to 10 inclusive
    val range = 1 to 10   
    //creates a range between 1 to 10 exclusive   
    val range2 = 1 until 10   
    //from 2 to 10 with jumps of 3  
    val range3 = 2 until 10 by 3   
    println(range.toList)
    println(range2.toList)
    println(range3.toList)
    println(range)
    val reverse = "Scala".reverse //reverse a string   
    println(reverse)
    val cap = "scala".capitalize //make first char caps  
    println(cap)
    
    // if statement
    
     var x = 30;

      if( x < 20 )
      {
         println("This is if statement");
      }
      else
      {
         println("This is else statement");
      }
  }
}