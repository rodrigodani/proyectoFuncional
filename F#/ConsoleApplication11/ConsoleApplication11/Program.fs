// Más información acerca de F# en http://fsharp.net
// Vea el proyecto "Tutorial de F#" para obtener más ayuda.
open System

let rec vecsum a b =
    match a, b with
    | [], [] -> []
    |  _, [] -> []
    |  [],_ -> []
    | a::taila, b::tailb -> a + b :: (vecsum taila tailb)

let rec matsum a b =
    match a, b with
    | [], [] -> []
    |  _, [] -> []
    |  [],_ -> []
    | a::atail, b::btail -> (vecsum a b) :: (matsum atail btail)

let rec vecres a b =
    match a, b with
    | [], [] -> []
    |  _, [] -> []
    |  [],_ -> []
    | a::taila, b::tailb -> a - b :: (vecres taila tailb)

let rec matres a b =
    match a, b with
    | [], [] -> []
    |  _, [] -> []
    |  [],_ -> []
    | a::atail, b::btail -> (vecres a b) :: (matres atail btail)       

let calculadoraM= fun op a b -> op a b

[<EntryPoint>]
let main argv = 
    let a = [ [2;1];[2;1] ]
    let b = [ [1;2];[1;2] ]

    let c = calculadoraM matsum a b
    printfn "%A" c

    
    Console.ReadKey() |> ignore
    0 // devolver un código de salida entero
