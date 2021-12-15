// Más información acerca de F# en http://fsharp.net
// Vea el proyecto "Tutorial de F#" para obtener más ayuda.
open System


let rec fac a=
    match a with
    | 0 -> 1
    | a -> a * fac (a-1)  

[<EntryPoint>]
let main argv = 
    let fa = fac 6

    printfn "%A" fa
    Console.ReadKey() |> ignore
    0 // devolver un código de salida entero
