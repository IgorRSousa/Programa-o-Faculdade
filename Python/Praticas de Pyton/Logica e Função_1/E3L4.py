from ch0 import VerificaPrimo

N = int(input("Informe o comprimento: "))
for numero in range (10**(N-1),10**N):
    n = numero
    while n != 0:
        if not(VerificaPrimo(n)):
            break
        else:
            n //= 10
    if n == 0:
        print(numero)
