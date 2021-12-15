// Más información acerca de F# en http://fsharp.net
// Vea el proyecto "Tutorial de F#" para obtener más ayuda.

open System;


let suma a b = a + b 
let resta a b = a - b 
let multiplicacion a b = a * b 
let division a b :double = a / b 


let calculadora= fun op a b -> op a b
[<EntryPoint>]
let main argv = 
    let res = calculadora multiplicacion 4.0 3.0
    printfn "%A"(res)

    Console.ReadKey() |> ignore
    0 // devolver un código de salida entero
