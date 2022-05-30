'Alunos : Igor Rafael de Sousa e Pedro Joaquim '

cod = input("Insira mensagem codificada : ").lower()
dcod = []
tam=len(cod)

for i in range(tam):
    if(cod[i]== 'p'):
        dcod.append(cod[i+1])
    if(cod[i]== ' '):
        dcod.append(' ')


sdcod="".join(dcod)

if('pp' in sdcod):
    sdcod = sdcod.replace("pp","p")
    

print(sdcod)
