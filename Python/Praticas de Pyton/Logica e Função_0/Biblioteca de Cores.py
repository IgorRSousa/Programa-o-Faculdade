def Inserir():
    global listaRGB
    Ncor=input("Insira o Nome da cor: ").upper()
    CodCor=input("Insira o Codigo da cor(Ex:#1C1C1C): ").upper()
    listaRGB.append((Ncor,CodCor))

def Consultar():
    global listaRGB
    cont=0
    consultacor=input("Insira a cor que deseja consultar: ").upper()
    for i in listaRGB:
        if(consultacor in i):
            print(*i)
            cont=1
    if(cont==0):
        print("Cor não encontrada !")

def Listagem():
    global listaRGB
    for i in listaRGB:
        print(*i)

listaRGB=[]
while(True):
    print("""
____________________
|                  |
|   1.Inserção     |
|   2.Consulta     |
|   3.Listagem     |
|   4.Encerrar     |
|__________________|
""")
    opcao=int(input("Insira o numero da opção que deseja executar: "))
    if(opcao==1):
        Inserir()
    elif(opcao==2):
        Consultar()
    elif(opcao==3):
        Listagem()
    elif(opcao==4):
        break
    else:
        print("Numero de função da Invalido")

