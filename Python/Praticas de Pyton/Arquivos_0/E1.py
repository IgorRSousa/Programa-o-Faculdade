f=open('alunos.txt','w')
while(True):
    nome = input("Nome: ")
    n1 = float(input("Nota 1: "))
    n2 = float(input("Nota 2: "))
    f.write(f"{nome} - {n1:.2f} e {n2:.2f}\n")
    while True:
        resp = input("Quer continuar? [S/N] ").upper()[0]
        if resp in 'SN':
            break
    print("ERRO! Por favor, responda apenas S ou N.")
    if resp == 'N':
        break
    f.close()
    f = open('alunos.txt', 'r')
    for line in f:
        print(line)
f.close()
