s = input("Insira a String desejada: ").lower()
ls= list(s)
c = 'bcdfghjklmnpqrstvwxyzç'
v = 'aeiouáéíóúàèìòùâêîôûãõ'

cont=0
r=len(s)

for i in range(r):
    if(ls[i] in v):
        cont+=10
    if(ls[i] in c):
        cont+=5

print("pontos :",cont)


