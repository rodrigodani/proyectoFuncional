// Más información acerca de F# en http://fsharp.net
// Vea el proyecto "Tutorial de F#" para obtener más ayuda.
open System
let modu a b= a % b

let primo a =
    let mutable c = 0
    for i in 1..a do
       if modu a i = 0 then c <- c + 1
       else  printf("")     
    if c=2 then "es primo"
    else "no es primo"

[<EntryPoint>]
let main argv =
    let modul = primo 5
    printfn "%A" modul


    Console.ReadKey() |> ignore
    0 // devolver un código de salida entero
