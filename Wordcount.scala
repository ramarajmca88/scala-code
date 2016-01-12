
import scala.io.Source
object Wordcount {
   def main(args:Array[String]) {
   
  //println(Source.fromFile("C:/Users/ramaraj.paulraj/workspace/sample_scala_pgms/src/data.txt")) 
   
  val s1 = Source.fromFile("C:/Users/ramaraj.paulraj/workspace/sample_scala_pgms/src/data.txt").mkString; //returns the file data as String
  println(s1)
 
    
  val counts = s1.split("\\s+").groupBy(x=>x).mapValues(x=>x.length) 
   
  println(counts)
   
  println("Count of words:"+counts)
   
  }

}