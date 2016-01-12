

object function {
  def main(args: Array[String])
  {
    println(add(2,2));
  }
  def add(a:Int , b:Int) : Int =  // :int =  -> this is the return type of the method
  {
    var sum:Int = 0
    sum = a + b
    return sum
  }
}

