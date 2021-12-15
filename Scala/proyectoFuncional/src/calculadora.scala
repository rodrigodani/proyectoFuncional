

object calculadora {
     def main(args: Array[String]): Unit = {
    var a= Console.readDouble();
    var b= Console.readDouble();
    var ope = Console.readLine();
    
    ope  match {
      case "resta" => println(calcu(a, b, resta))   
      case "suma" => println(calcu(a, b, suma))   
      case "multip" => println(calcu(a, b, multi))   
      case "divi" => println(calcu(a, b, divi))   
    }
    
  }
   def calcu (a: Double, b: Double, f1:(Double,Double)=>Double): Double =
   {
     f1(a,b); 
   }
   
   def resta (a: Double, b: Double): Double =
   {
     a - b;
   }
   def suma (a: Double, b: Double): Double =
   {
     a + b;
   }
   def multi (a: Double, b: Double): Double =
   {
     a * b;
   }
   def divi (a: Double, b: Double): Double =
   {
     a / b;
   }
}