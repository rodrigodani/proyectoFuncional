// Más información acerca de F# en http://fsharp.net
// Vea el proyecto "Tutorial de F#" para obtener más ayuda.

open System;
let rec fibsRec a b =
  if a + b < 2 then
    let current = a + b
    let rest = fibsRec b current  
    current :: rest
  else 
    [] 


[<EntryPoint>]
let main argv =
    let fibs = 0::0::(fibsRec 1 0)
    printfn "%A"(fibs)

    Console.ReadKey() |> ignore
    0 