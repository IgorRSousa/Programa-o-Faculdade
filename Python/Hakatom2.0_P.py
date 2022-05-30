import json

def Operador(nome, linha, prio, parada, data, horas, descri, nomeop):

    dici = {"nome da maquina": nome,
            "linha": linha,
            "prioridade": prio,
            "houve parada": parada,
            "data": data,
            "horário": horas,
            "deacrição": descri,
            "nome do operário": nomeop}

    dici_json=json.dumps(dici)
    with open('produtos.txt', 'a+') as file:
        file.write(dici_json)
        file.write("\n")

def Gerente():
    lista = []
    maquinas=[]
    pLinha=[]
    dias=[]
    tdias=[]

    with open('produtos.txt', 'r') as file:

        for line in file:
            d_linha=json.loads(line)
            lista.append(d_linha)
            maquinas.append(d_linha["nome da maquina"])
            pLinha.append(d_linha["linha"])
            dias.append(d_linha["data"])
        comparação(maquinas)
        comparação(pLinha)
        tdias=media(dias)


def comparação(x):

    todx=[[],[]]
    cont=0

    for i in range(len(x)):
        for j in range(i+1,len(x)):
            if x[i] == x[j]:
                cont = 1
        if cont == 0:
            todx[0].append(x[i])
        cont = 0


    for i in range(len(todx[0])):
        cont = 0
        for j in range(len(x)):
            if todx[0][i] == x[j]:
                cont+=1
        todx[1].append(cont)

    return todx

def media(x):
    descdias=comparação(x)
    media=0
    for i in range(len(descdias[1])):
        media+=(descdias[1][i])
    media = (media / len(descdias[1]))
    print('Éstá é a media de problemas por dia: {:.2f}'.format(media))
    return media



"-----------------------------------------------------------------------------------------------------------------------"

while(True):
    opc = int(input("____________________________\n"
                    "|Quem esta entrando        |\n"
                    "|Operador - 1              |\n"
                    "|Gerente. - 2              |\n"
                    "|Encerra. - 3              |\n"
                    "|__________________________|\n Resposta: "))

    if(opc==1):

        Nome=input("Insira o nome da maquina: ").upper()
        Linha = input("\nInsira a linha da maquina(1 a 6): ")
        Prioridade = input("\nInsira a Prioridade(B-baixo|M-media|A-Alta): ").upper()
        hParadas = input("\nHouve paradas ?(S/N) : ").upper()
        Data = input("\nInsira a data(dd/mm/aa): ")
        Hora = input("\nInsira a hora (hh:mm:ss): ")
        Descrição = input("\nInsira a descrição: ")
        Nomeop = input("\nInsira o nome do Operador: ")

        Operador(Nome,Linha,Prioridade,hParadas,Data,Hora,Descrição,Nomeop)

    if (opc == 2):
        lista=Gerente()

    if (opc == 3):
        break
