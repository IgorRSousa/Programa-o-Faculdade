def soma_nat(n):
    n=[i for i in range(n+1)]
    return sum(n)

n=int(input("Insira um valor natural para se feito a soma dos valores ate ele:"))
print(soma_nat(n))
