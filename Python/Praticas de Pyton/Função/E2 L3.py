def potencia(base,expoente):

    res = base**expoente

    return res

while(True):

    b = int(input("Insira um valor para ser a base(Numero deve ser Inteiro): "))
    e = int(input("Insira um valor para ser o expoente(Numero deve ser Inteiro): "))

    if(e >=0):
        break
    else:
        print("!!expoente invalodo!! \n !!tente novamente!!")

print(potencia(b,e))
