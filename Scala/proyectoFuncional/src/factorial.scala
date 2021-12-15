

object factorial {
  def main(args: Array[String]): Unit = {
    var a:Int= (Console.readDouble()).toInt;
   println(fac(a)); 
  }
  def fac (a: Int):Int=
  {
    var fact = a;
    var res = 1;
    for (i <- 1 to fact)
    {
        res = res * i;
    }
    return res;

  }
}