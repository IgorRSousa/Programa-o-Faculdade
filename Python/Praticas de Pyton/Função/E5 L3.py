def VerificaPrimo (x):
    if (x == 1 or x == -1):
        return False
    for i in range(2,x,1):
        primo=x%i
        if(primo==0):
            return False
    return True
def intervalo(x,y):
    for j in range(x,y+1):
        teste=VerificaPrimo(j)
        if(teste==True):
            print(j)
            
inicio=int(input("Insira o valor incial do intervalo: "))
fim=int(input("Insira o valor final do intervalo: "))

intervalo(inicio,fim)
