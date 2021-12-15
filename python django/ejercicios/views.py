from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.
def show_form(request):
    return render (request, 'registro.html')

def fib(request):
    serie=""
    c=0
    a=0
    b=0
    for i in range (4):
        if (i==0 or i ==1):
            serie = serie + "0" + ", "
            a = 1
        else:
            c = a + b
            a = b
            b = c
            serie = serie + str(c) + ", "


    return HttpResponse("Fibonacci 4 terminos:  "+ serie)
    
def calcu(request):
    a = request.POST['na']
    b = request.POST['nb']
    op = request.POST['op']
    
    if (op == "suma"):
        return HttpResponse("La suma es: "+calculadora(int(a),int(b),suma))
    elif (op == "resta"):
        return HttpResponse("La resta es: "+calculadora(int(a),int(b),resta))
    elif (op == "multiplicacion"):
        return HttpResponse("La multipicacion es: "+calculadora(int(a),int(b),multiplicacion))
    else:
        return HttpResponse("la division es: "+calculadora(int(a),int(b),division))

def calculadora(a, b, fun):
    return fun(a, b);
suma = lambda a, b:a+b        
resta = lambda a,b:a-b    
multiplicacion = lambda a,b:a*b    
division = lambda a,b:a/b    


def calcuM(request):
    a = [[1,2],[1,2]]
    b = [[1,2],[1,2]]
    op = request.POST['op']
    r=[]
    if (op == "suma"):
        r = calculadoraM(a,b,sumaM)
    elif (op == "resta"):
        r= calculadoraM(a,b,restaM)
    else:
        r=calculadoraM(a,b,multiplicacionM)
    
    retorno='';
    response = HttpResponse()
    html = '<br/>'
    for i in range(len(r)):
        response.write(html)
        for j in range(len(r[i])):
            response.writelines(str(r[i][j])+" ")
        
    return response



def calculadoraM(a, b, fun):
    return fun(a, b);
def sumaM(a,b):
    for i in range(len(a)):
        for j in range(len(a[i])):
            a[i][j]= a[i][j]+b[i][j]
    return a
def restaM(a,b):
    for i in range(len(a)):
        for j in range(len(a[i])):
            a[i][j]= a[i][j]-b[i][j]
    return a

def multiplicacionM (a,b):
    matriz = []
    matriz = []
    for i in range(len(a)):
        p = [0]*len(b[0])
        matriz.append(p)
    for k in range(len(a)):
        for i in range(len(b[k])):
            suma=0
            for j in range(len(a[i])):
                suma=suma+(a[k][j]*b[j][i])
            matriz[k][i] = suma
    return matriz


def fac(request):
    n = int(request.POST['nfac'])
    fact = 1
    for i in range(1,n+1):
        fact = fact * i

    return HttpResponse("el factorial de "+str(n) +" es:"+str(fact))

def primo(request):
    primo = int(request.POST['np'])
    con=0
    for i in range(1,primo+1):
        if ((primo % i)==0):
            con= con+ 1
        print (i)
    if (con == 2 or primo ==1):
        re = "es primo"
    else:
        re = "no es primo"
    return HttpResponse("El numero "+str(primo)+" "+re)