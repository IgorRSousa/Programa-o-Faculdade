string = input("insira uma palavra ou frase: ")
sub = input('Digite dois caracteres sendo o 1° presente na palavra ou frase e 2° para substituir o 1°(!!como escrever 1°/2°!!): ')
l=sub.split("/")
k = string.replace(l[0],l[1])
print(k)

alteracoes=string.count(l[0])
print(f"Ocorrerão {alteracoes} subistituições !!")
