f=open('atletas.txt','w+')
while(True):
    nome=input("Nome do Atleta: ")
    altura=float(input("Altura: "))
    peso=float(input("Peso: "))
    f.write(f"{nome};{altura:.2f};{peso:.2f}\n")
    end=input("Continuar? [S/N]\n ").upper()

    if(end =='N'):
        break
f.seek(0)
for lines in f:
    x=lines.split(";")
    imc=float(x[2])/(float(x[1])**2)
    print(f"{lines} \n {imc:.2f}")
        
            
f.close()

