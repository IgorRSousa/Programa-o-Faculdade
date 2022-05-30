frase = input("insira uma frase: ")

f = frase.lower()
#1° Solução

a=f.count('a')
e=f.count('e')
i=f.count('i')
o=f.count('o')
u=f.count('u')

total=a+e+i+o+u

print(f'A frase tem {total} de vogais!!')
#2° Solução

cont1=0
for i in range(len(f)):
    
    if(f[i]=='a' or f[i]=='e' or f[i]=='i' or f[i]=='o'or f[i]=='u'):
        cont1+=1
        
print(f'A frase tem {cont1} de vogais!!')
#3° Solução

cont1=0
vogais='aeiou'

for i in range(len(f)):
    
    if(f[i] in vogais):
        cont1+=1
        
print(f'A frase tem {cont1} de vogais!!')
