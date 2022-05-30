def numsign(x):
    if(x<=9):
        return x
    return numsign(x//10)

print("Valores devem ser inseridos com virgula entre eles ex:1234,4321\n")

ai=input("Insira os valores: ")
ai=ai.split(",")
a=int(ai[0])
b=int(ai[1])

print(numsign(a)+numsign(b))
