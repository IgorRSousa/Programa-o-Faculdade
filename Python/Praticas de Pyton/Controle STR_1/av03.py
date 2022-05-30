'''
Nomes: Igor Rafael de Sousa e Pedro Joaquim dos Santos Britto
RA:607568 e 604038

Mensagens para teste:
eu acredito na educacao.
29,64,116,8,13,75,18,13,30,61,60,114,24,43,87,7,10,57,13,9,21,41,45,85.'''

def menu():
    print("""
------------------------
|  1.Criptografar      |
|  2.Decriptografar    |
|  3.Ecerrar           |
|-----------------------
""")
    return(int(input("O que deseja fazer ? \n  ")))
    
def converter(x):
    nm=[]
    for letra in x:
        nm.append(lista.index(letra))

    return nm

def divm(nm):
    mr=[[],[]]
    if (len(nm)%2)== 0:
        for i in range(len(nm)//2):
            mr[0].append(nm[i])
            mr[1].append(nm[i + (len(nm)//2)])
    else:
        nm.append(29)
        for i in range(len(nm)//2):
            mr[0].append(nm[i])
            mr[1].append(nm[i + (len(nm)//2)])

    return mr

def criptogrfar(x):
    a=[[3,1],[2,1]]
    multi=[[],[]]
    for j in range(len(x[0])):
        multi[0].append((a[0][0] * x[0][j]) + (a[0][1] * x[1][j]))
        multi[1].append((a[1][0] * x[0][j]) + (a[1][1] * x[1][j]))

    return multi

def decriptogrfar(x):
    a=list(x)
    c=[]
    b=[]
    for i in range(len(a)):
        if(a[i]=='.'):
            c.append(int("".join(b)))
            b=[]
        elif(a[i]!=','):
            b.append((a[i]))
        else:
            c.append(int("".join(b)))
            b=[]

    c=divm(c)        

    b=[[1,-1],[-2,3]]
    multi=[[],[]]
    for j in range(len(c[0])):
        multi[0].append((b[0][0] * c[0][j]) + (b[0][1] * c[1][j]))
        multi[1].append((b[1][0] * c[0][j]) + (b[1][1] * c[1][j]))

    return multi

def colet(L):
    msg=[]
    uni=[]
    n=0
    for i in range(2):
        for j in range(len(L[0])):
            uni.append(L[i][j])
    
    for i in range(len(uni)):
        if uni[i] <= 26:
            n= uni[i] + 64
            print(f'{chr(n)}',end="")
        elif uni[i] == 27:
            print(f'{chr(uni[i]+19)}',end="")
        elif uni[i] == 28:
            print(f'{chr(uni[i]+5)}',end="")
        elif uni[i] == 29:
            print(f'{chr(uni[i]+6)}',end="")
        else:
            print(f'{chr(uni[i])}',end="")
  
while(True):

    teste=menu()
    lista= "*ABCDEFGHIJKLMNOPQRSTUVWXYZ.!# "

    if(teste==1):

        mens=input("Insira a mensagem: ").upper().replace(" ","#")
        msnum=divm(converter(mens))
        mscrip=criptogrfar(msnum)
        print("\nMensagem criptografada: ")

        for i in range(2):
            for j in range((len(mscrip[0]))):
                print(mscrip[i][j],end=" ")
        print('\n')    
    if(teste==2):
        print("Exemplo de mensagem criptogrfada: 29,64,116,8,13,75.\n")
        mens=input("Insira a mensagem criptogrfada: ").upper().replace(" ","#")
        mscrip=decriptogrfar(mens)
        
        print("\nMensagem decriptografada: ")
        colet(mscrip)
        print('\n')
    if(teste==3):
        break


