

object esprimo {
  
  def main(args: Array[String]): Unit = {
   
    println("Introduce un numero para ver si es primo o no");
     var a:Int= (Console.readDouble()).toInt;
    if (esprim(a.toInt))
    {
        println("Es primo");
    }else
    {
        println("no es primo");
    }
    

   
  }
  def esprim (a: Int):Boolean=
  {
     var pri = a;
    var con = 0;
    for (i <- 1 to pri)
    {
        if ((pri % i) == 0)
        {
            con=con +1;
        }
    }
    if (con == 2 || pri == 1)
    {
        return true;
    }
    return false;


  }

}