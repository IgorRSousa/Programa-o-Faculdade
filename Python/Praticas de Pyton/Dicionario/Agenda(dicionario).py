def cadastro ():
    global agenda
    x=input("Insira o Nome: ")
    if x in agenda:
        print("Nome Ja Cadastrado!!")
    else:
        y=input("Insira o Numero da pessoa: ") 
        agenda[x]=y
        print("Efetuado o cadastro !")

def consuta(x):
    global agenda
    print(agenda.get(x,"Não encontrado"))

def delete(x):
    global agenda
    del agenda[x]
    print(f"{x} Removido com sucesso !!")

def alterar(x):
    global agenda
    if x not in agenda:
        print("Nome não esta presente na Agenda !")
    else:
        y=input("Insira o Numero novo da pessoa: ")
        agenda[x]=y
        print("Efetuado o alteração !")
def listar():
    global agenda
    for n , t in agenda.items():
        print(f"{n}:{t}")


agenda={}
while(True):
    print("""
 ________________________
|                        |
| 1.Cadastrar            |
| 2.Consultar            |
| 3.Apagar               |
| 4.Alterar              |
| 5.Listar               |
| 6.Encerrar             |
|________________________|
==========================================================================
""")
    teste=int(input("O que deseja fazer ? \n  "))
    if(teste == 1):
        cadastro ()
    elif(teste == 2):
        nome=input("Insira o nome da pessoa que procura: ")
        consuta(nome)
    elif(teste == 3):
        nome=input("Insira o nome da pessoa que quer deletar: ")
        delete(nome)
    elif(teste == 4):
        nome=input("Insira o nome da pessoa que quer alterar: ")
        alterar(nome)
    elif(teste == 5):
        listar()
    elif(teste == 6):
        print("!DEAD END!")
        break
        
        
