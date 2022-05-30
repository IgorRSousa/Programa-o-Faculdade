def inverte(x):
    a=[]
    y=(len(x))-1
    for i in range(y,-1,-1):
        a.append(x[i])
    a = "".join(a)
    return a

num = input("Insira uma valor: ")
print("Valor invertido :",inverte(num))       
