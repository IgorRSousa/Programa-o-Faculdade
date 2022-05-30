def quad (x):
    return x**2

def quadrados (n):
    return list(map(quad, [i for i in range(1,n+1)]))

a=int(input("Insira um valor natural: "))
print(*(quadrados (a)))
