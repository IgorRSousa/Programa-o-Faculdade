def paridade(x):
    
    num = x % 2

    if(num==0):
        print('Esse numero é par !')
    else:
        print('Esse numero é inpar !')

num = int(input("Insira um numero: "))

paridade(num)
