from random import randint

def procura(l,n):
    if(len(l)==0):
        return False
    if(l[0]==n):
        return True
    return procura(l[1:],n)
    

a=[]
for i in range(10):
    a.append(randint(1,20))
print(a)

c=int(input("Digite o elemento que procura: "))
if(procura(a,c)== True):
    print("Elemento está na lista!")
else:
    print("Elemento não está na lista!")
