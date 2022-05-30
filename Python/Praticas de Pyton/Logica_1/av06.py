#Alunos : Igor Rafael de Sousa e Pedro Joaquim
#RA: 607568 e 604038

ordMenssagens=[]
Menssagens=[]
nMenssagens=int(input("Insira o nomero de menssagens recebidas: "))

print("Insira os nomes das pessoas que enviaram as menssagens(PRESS Enter entre os nomes): ")

for i in range(nMenssagens):
    Menssagens.append(input().upper())

for i in range((len(Menssagens))-1,-1,-1):
    if (Menssagens[i] not in ordMenssagens):
        ordMenssagens.append(Menssagens[i])

print("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")

for i in ordMenssagens:
    print(*i)
        
    
    
