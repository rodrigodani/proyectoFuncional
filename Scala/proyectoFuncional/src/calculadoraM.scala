import Array._

object calculadoraM {
   def main(args: Array[String]): Unit = {
      var a = ofDim[Int](2,2)
      var b = ofDim[Int](2,2)
      a(0)(0)=1
      a(0)(1)=2
      a(1)(0)=1
      a(1)(1)=2
      b(0)(0)=1
      b(0)(1)=2
      b(1)(0)=1
      b(1)(1)=2
      var ope = Console.readLine();
      var mat= ofDim[Int](2,2);
      ope  match {
      case "resta" => mat = calcu(a, b, resta)   
      case "suma" => mat = calcu(a, b, suma)   
      case "multip" => mat = calcu(a, b, multi)   
      }
      
      for (p <- 0 to mat.length-1) 
      {
          for (k <-0 to mat(p).length-1)
          {
              print(mat(p)(k)+" ")
          }
          println()
      }
      
    }
   def calcu (a: Array[Array[Int]], b: Array[Array[Int]], f1:(Array[Array[Int]],Array[Array[Int]])=>Array[Array[Int]]): Array[Array[Int]] =
   {
     f1(a,b); 
   };
   
   def suma (a: Array[Array[Int]], b: Array[Array[Int]]):Array[Array[Int]]=
   {
     
      for (p <- 0 to a.length-1) 
      {
          for (k <-0 to a(p).length-1)
          {
              a(p)(k) = a(p)(k)+b(p)(k);
          }
      }
      return a;
   }
   
   def resta (a: Array[Array[Int]], b: Array[Array[Int]]):Array[Array[Int]]=
   {
     
      for (p <- 0 to a.length-1) 
      {
          for (k <-0 to a(p).length-1)
          {
              a(p)(k) = a(p)(k)-b(p)(k);
          }
      }
      return a;
   }
   
   def multi (a: Array[Array[Int]], b: Array[Array[Int]]):Array[Array[Int]]=
   {
     var mul = ofDim[Int](a.length,b(0).length);

    for (k <-0 to a.length-1)
    {
        for (i <- 0 to b(0).length-1)
        {
            var su = 0;
            for (j <- 0 to a(0).length-1)
            {
                su = su + (a(k)(j) * b(j)(i))
            }
            mul(k)(i) = su;
        }
    }
    return mul;

   }
   
}