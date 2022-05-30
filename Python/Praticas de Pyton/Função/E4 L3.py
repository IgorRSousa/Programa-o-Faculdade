'''
Prof Renata :

def verificaPrimo(num):
    if num == 1 or num == -1:
        return False
    for i in range(2,num//2+1):
        if num % i == 0:
            return False
    return True'''

def VerificaPrimo (x):
    if (x == 1 or x == -1):
        return False
    for i in range(2,x):
        primo=x%i
        if(primo==0):
            return False
    return True

valor=int(input("Insira um valor para vericar se ele é primo: "))
p=VerificaPrimo(valor)

if(p==True):
    print("Valor é primo!!")
else:
    print("Valor não é primo!!")
