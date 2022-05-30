from ch0 import VerificaPrimo

def verificagemeo(x):
    y=x+2
    if(VerificaPrimo(y)):
        return True
    else:
        return False

a=int(input("Insira o inicio do intervalo: "))
b=int(input("Insira o final do intervalo: "))
cont=0
for i  in range(a,b+1):
    if(VerificaPrimo(i)):
        if(verificagemeo(i)):
            cont+=1

print(f"No intevalo informado exitem {cont} Gemeos Primos!!")
    
    
