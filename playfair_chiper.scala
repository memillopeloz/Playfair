import scala.language.postfixOps

object HelloWorld {
  def main(args: Array[String]): Unit = {

  	//*************** KEY TREATMENT *************** //

	// readLine lets you prompt the user and read their input as a String
	val key = readLine("What's the key? ")

	//lowercase to uppercase, convert J to I and verify that is letter
	def makeCompatible(s: String) = s toUpperCase() replace('J', 'I') filter(_.isLetter) toList 
	
	val abc = "abcdefghijklmnopqrstuvwxyz"

	val cleankeyWord = makeCompatible(key).distinct

	val abcClean = makeCompatible(abc)

	val matrix = cleankeyWord ::: abcClean

	val keyMatrix = matrix.distinct

	val hashMap = Map(keyMatrix map (i => i.key -> i.value): _*)

	println(s"Full matrix Without repeated: $hashMap")

	//*************** PT TREATMENT *************** //

	val PT = readLine("PT? ")
	println(s"Your PT is $PT")

	val ptClean = makeCompatible(PT)

	/*def loop(list: List[Char]) {
	    list match {
	      case Nil => println("Empty list")
	      case x :: Nil => println("last " + x)
	      case x :: tail => {

	        println(x + " - " + tail.head)
	        loop(tail)
	      }

	    }
	}*/

	var ct = "";

	def pairReplacement (s1 : String, s2 : String){
		//encontrar L en keyMatrix

	}

	val r = ptClean.zip(ptClean.drop(1)).withFilter(t => t._1 != t._2).map(_._1) :+ ptClean.last
	val temp = ptClean.zip(ptClean.drop(1))
	println(s"Temp: $temp")

	val temp2 = ptClean.zip(ptClean.drop(1)).withFilter(t => t._1 != t._2).map(_._1)
	println(s"Temp: $temp2")

	//val r = ptClean.zip(ptClean.drop(1)).withFilter(t =>  if (t._1 == t._2) "w").map(_._1) :+ ptClean.last

	println(s"r es $r")

	//loop(ptClean)


  }
}