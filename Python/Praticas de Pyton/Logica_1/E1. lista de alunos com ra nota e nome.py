while(True):
    lista=[]
    alunos={}
    alunos[RA]=int(input("Insira o RA:"))
    alunos[nome]=input("Insira o nome:")
    alunos[nota]=float(input("Insira o nota:"))
    lista.append(alunos.copy())
    a=input("Deseja continuar inserir alunos (S/N)?").upper()
    if (a=='N'):
        break
print(lista)
