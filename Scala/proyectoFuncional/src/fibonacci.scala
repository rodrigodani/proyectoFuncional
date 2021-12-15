


object fibonacci {
   def main(args: Array[String]): Unit = {
    
   println(fib()); 
  }
   def fib():String =
   {
     var ret=""
     var c=0
     var a=0
     var b=0
     var i=0
     while (i< 4)
     {
       if (i ==0 || i ==1)
       {
         ret = ret + 0 +", "
         a=1
       }else{  
         c = a + b;
         a = b;
         b = c;
         ret = ret + c +", " 
       } 
       i=i+1
     }
     return ret
     
   }

}