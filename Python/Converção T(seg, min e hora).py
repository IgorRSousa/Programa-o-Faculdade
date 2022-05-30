def menu():
    print("""
---------------------------------------------------------------------------------------
| 1 - Tranformar segundo em hh:mm:ss no relogio de Krunensberg                        |
| 2 - Tranformar hh:mm:ss no relogio de Krunensberg para segundo                      |
| 3 - Tranformar hh:mm:ss no relogio de Krunensberg para hh:mm:ss do relogio normal   |
| 4 - Encerrar                                                                        |
---------------------------------------------------------------------------------------
""")
    return int(input("Escolha uma das funçâo acima:"))

def função1(x):
    h=str(x//10000)
    m=str((x%10000)//100)
    s=str(x%100)
    a=[h,':',m,':',s]
    re="" .join(a)
    return re

def função2(h,m,s):
    h*=10000
    m*=100
    re=h+m+s
    return re

def função3(h,m,s):
    seg=função2(h,m,s)
    h=str(seg//3600)
    si=seg%3600
    m=str(si//60)
    s=str(si%60)
    a=[h,':',m,':',s]
    re="" .join(a)
    return re

while(True):
    r=menu()
    if(r==1):
        c=int(input("Insira quatidade de segundos : "))
        print(f"Os segundos equivalem: {função1(c)}")
    elif(r==2):
        a=int(input("Insira quatidade de horas : "))
        b=int(input("Insira quatidade de minutos : "))
        c=int(input("Insira quatidade de segundos : "))
        print(f"Os valores equivalem a {função2(a,b,c)} segundos")
    elif(r==3):
        a=int(input("Insira quatidade de horas : "))
        b=int(input("Insira quatidade de minutos : "))
        c=int(input("Insira quatidade de segundos : "))
        print(função3(a,b,c))
    elif(r==4):
        break
    else:
        print('\nOpção invalida!!')
    
