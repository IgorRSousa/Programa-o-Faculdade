#alunos envolvidos:
#Nome:Igor Rafael e Pedro Joaquim
#RA: 607568 e 604038
def menuP ():
    print(
        """
|========================================================|
|                                                        |
|                    Menu Principal                      |
|                                                        |
|========================================================|
| 1. Cantor(a)                                           |
| 2. Músicas                                             | 
| 3. PlayList                                            |
| 4. Sair                                                |
==========================================================
""")
    return input("\n  O que deseja Acessar ?\n    ->")

def Cantor():
    while(True):
        print(
        """
|========================================================|
|                                                        |
|                       Cantor(a)                        |
|                                                        |
|========================================================|
| a) Cadastro                                            |
| b) Listagem dos cantores                               |
| c) Consulta a um determinado cantor                    |
| d) Retornar ao Menu Principal                          |
==========================================================
""")
        x =input("\n  O que deseja Fazer ?\n    ->").upper()
        if(x == "A"):
            CadastroCantor()
        elif(x == "B"):
            ListagemDosCantores()
        elif(x == "C"):
            ConsultaCantor()
        elif(x == "D"):
            print("\n !Carregando Menu Principal!\n")
            break
        else:
            print("\n!Opção Invalida!\n")

        
def CadastroCantor():
    global cantores
    nome=str(input('Insira o nome do Cantor(a): '))
    if nome not in cantores:
        cantores[nome]=0
    else:
        while(True):
            print('Cantor ja cadastrado')
            nome=str(input('Insira outro nome do cantor, ou se deseja parar digite N: '))
            if (nome == 'n') or (nome == 'N'):
                return cantores
            else:
                if nome not in cantores:
                    cantores[nome]=0
                    break
            
    cod=input('Insira o codigo do Cantor(a): ')        
    if cod in cantores.values():
        while(True):
            print('Codigo ja cadastro')
            cod=input('Insira outro codigo do Cantor(a): ')
            if cod not in cantores.values():
                cantores[nome]=cod
                print("\n Cadastrado com Sucesso !\n")
                break
    else:
        cantores[nome]=cod
        

def ListagemDosCantores():
    global cantores
    if(len(cantores)==0):
        print("Nenhum cantor(a) cadastrado!!\n")
    else:
        for k,v in cantores.items():
            print(f' Cantor(a):{k}, Código: {v}')

def ConsultaCantor():
    global cantores
    name=input("Insira o nome do cantor que deseja consultar: ")
    if(name in cantores):
        print(f"Codigo: {cantores[name]}")
    else:
        print("\n Não encontrado! \n")

def MusicasF():
    while(True):
        print(
        """
|========================================================|
|                                                        |
|                        Musicas                         |
|                                                        |
|========================================================|
| a) Cadastro de Musica                                  |
| b) Listagem das Musicas                                |
| c) Consulta a um determinado Musica                    |
| d) Retornar ao Menu Principal                          |
==========================================================
""")
        x =input("\n  O que deseja Fazer ?\n    ->").upper()
        if(x == "A"):
            CadastroDeMusica()
        elif(x == "B"):
            ListagemDasMusicas()
        elif(x == "C"):
            ConsultaMusica()
        elif(x == "D"):
            print("\n !Carregando Menu Principal!\n")
            break
        else:
            print("\n!Opção Invalida!\n")
            
def CadastroDeMusica():
    global Musicas
    global cantores
    r=0
    musica={}
    musica.clear()
    musica['musica'] = input("Nome da musica: ")

    for i in range(len(Musicas)):
        if(musica['musica'] in Musicas[i].values()):
            while(True):
                 print('Musica ja cadastrada!')
                 musica['musica'] = input("Digite outra musica se deseja parar digite N: ")
                 if(musica['musica'] == 'n') or (musica['musica'] == 'N'):
                     return print('\n')
                 else:
                     for i in range(len(Musicas)):
                         if(musica['musica'] in Musicas[i].values()):
                             r=1
                         else:
                             r=0
                             
                        
                 if r == 0:
                    break
        

    musica['codCantor'] = input("Codigo do cantor: ")
    if(musica['codCantor'] not in cantores.values()):
        while(True):
            print('!Cantor(a) não cadastrado!')
            musica['codCantor']= input('Insira outro codigo de cantor, ou se deseja parar digite N: ')
            if (musica['codCantor'] == 'n') or (musica['codCantor'] == 'N'):
                return print('você será redirecionado para o menu principal! ')
            elif (musica['codCantor'] in cantores.values()):
                for k,v in cantores.items():
                    if(v == musica['codCantor']):
                        print(f"Artista escolido: {k}")
                        r=1
                        break
            if r == 1:
                break
                    
    else:                   
        for k,v in cantores.items():
            if(v == musica['codCantor']):
                print(f"Artista escolido: {k}")

    if(musica['codCantor'] not in cantores.values()):
        return print("!Cantor(a) não cadastrado!\n  Volte ao menu Principal e faça o cadastro!")

    musica['Genero'] = input("Genero da Musica: ")
    Musicas.append(musica.copy())

def ListagemDasMusicas():
    global Musicas
    global cantores
    print("Lista de musicas Cadastradas: \n")
    for i in Musicas:
        print(f"Nome: {i['musica']}")
        for k,v in cantores.items():
            if(v == i['codCantor']):
                print(f"Cantor(a): {k}")
        print(f"Genero: {i['Genero']} \n")

def ConsultaMusica ():
    global Musicas
    global cantores
    q=0
    cMusica=input("Insira a musica que deseja consultar: ")
    for i in Musicas:
        if(cMusica == i['musica']):
            print(f"Nome da musica: {i['musica']}")
            for k,v in cantores.items():
                if(v == i['codCantor']):
                    print(f"Cantor(a): {k}")
            print(f"Genero: {i['Genero']}")
            q=1
    if(q==0):
        print("\n!Musica não encontrada!\n")

def Playlist():
    while(True):
        print(
        """
|========================================================|
|                                                        |
|                       Playlist                         |
|                                                        |
|========================================================|
| a) Gerar PlayList pelas músicas                        |
| b) Gerar PlayList pelo artista                         |
| c) Retornar ao Menu Principal                          |
==========================================================
""")
        x =input("\n  O que deseja Fazer ?\n    ->").upper()
        if(x == "A"):
            GerarpMusicas()
        elif(x == "B"):
            GerarpArtista()
        elif(x == "C"):
            print("\n !Carregando Menu Principal!\n")
            break
        else:
            print("\n!Opção Invalida!\n")

def GerarpMusicas():
    global Musicas
    global cantores
    x=[]
    print("Insira o nome da musica que quer colocar na Playlist(Para encerrar digite fim):")
    while(True):
        c=0
        a=input()
        for i in Musicas:
            if(a == i['musica']):
                x.append(i)
                c=i
        if(a=='fim'):
            break
        elif(c not in x):
            print("Musica não cadastrada, Insira uma valida!")
            
    print("\nMusicas adicionado na PlayList:\n")
    if len(x) == 0:
        print('!!!!Não foi adicionada nenhuma musica!!!')
    else:
        for i in x:
            for k,v in cantores.items():
                if(v == i['codCantor']):
                    print(f"Nome da musica: {i['musica']}")
                    print(f"Cantor(a): {k}")
                    print(f"Genero: {i['Genero']}")

def GerarpArtista():
    global cantores
    global Musicas
    x=[]
    y=0
    a=input("Insira o nome do artista: ")
    for k,v in cantores.items():
            if(k == a):
                y = v
    for i in Musicas:
        if(y == i['codCantor']):
            x.append(i)
    if(y == 0):
        print("\nArtista não cadastrado ou não posui musicas!\n")

    if len(x) == 0:
        print('!!!!Nenhuma musica foi cadastrada para esse cantor(a)!!!')
    else:
        for i in x:
            print(f"Nome da musica: {i['musica']}")
            for k,v in cantores.items():
                if(v == i['codCantor']):
                    print(f"Cantor(a): {k}")
                    print(f"Genero: {i['Genero']}")
                else:
                    print("\n!Musica não encontrada!\n")
                    
        
#Inicio do prog

Musicas=[]
cantores={}

while(True):
    opção=menuP()

    if(opção == '1'):
        Cantor()
    elif(opção == '2'):
        MusicasF()
    elif(opção == '3'):
        Playlist()
    elif(opção == '4'):
        print("""
Encerrando em... \n3 \n 2 \n  1 \n   end""")
        break
    else:
        print("\n Opção Invalida \n")
    
