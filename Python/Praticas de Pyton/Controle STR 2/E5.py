string=input('insira uma frase ou palavra para verificar se é um palíndrome: ')
palindrome = string[::-1]

if(string == palindrome):
    print('Essa frase é uma palíndrome')

else:
    print('Essa frase não é uma palíndrome')
