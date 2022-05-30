"""
4.Faça um programa no qual o usuário informa o nome do arquivo, e uma palavra, e retorne o
número de vezes que aquela palavra aparece no arquivo.

Teste:
    Exercicio 4.txt
    igor,bora,man,ola
"""

BT = open(input('Informe o nome do arquivo -> '),'r')
palavra=input('Informe a palavra que esta procurando ->')
texto=BT.read()
contagem =texto.upper().count(palavra.upper())

if(contagem > 0):
    print(f'Palavra esta presente {contagem} vezes no aquivo indicado!')
else:
    print(f'Plavra não encontrada no aquivo indicado!')

BT.close()

 
