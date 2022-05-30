from random import randint

def Pbinary (A,esquerda,direita,item):
    if(direita<esquerda):
       return -1
    meio=(direita+esquerda)//2
    if (A[meio]==item):
        return meio
    if (A[meio] > item):
        return Pbinary(A,esquerda,meio-1,item)
    else:
        return Pbinary(A,meio-1,direita,item)

a = []
for i in range(30):
    a.append(randint(1,100))    
a.sort()
print(*a,"\n")
elem=int(input("Insira um elemento a ser procurado na lista: "))
c=Pbinary (a,0,len(a),elem)
if(c==-1):
    print ("Elemento não encontrado na lista !")
else:
    print (f"Elemento encontrado na lista na posição {c} !")
