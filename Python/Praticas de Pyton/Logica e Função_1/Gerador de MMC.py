def primo(num):
    if num in range(-1,2):
        return False
    for i in range(2,num):
        if num % i == 0:
            return False
    return True

def nextPrimo(num):
    while True:
        num += 1
        if primo(num):
            return num

def encerrou(lista):
    if lista.count(1) == len(lista):
        return True
    return False

def mmc(lista):
    fatores = []
    p = 2
    while True:
        t = False
        for i,num in enumerate(lista):
            if num % p == 0:
               lista[i] = num // p
               t = True
        if t:
            fatores.append(p)
        else:
            p = nextPrimo(p)
        if encerrou(lista):
            break
    mmc = 1
    for n in fatores:
        mmc *= n
    return mmc

numeros = input("Entre com os números para cálculo do MMC, separados por espaço\n").split()
numeros = [int(n) for n in numeros]
print(f"O mmc de {numeros} é {mmc(numeros)}")
