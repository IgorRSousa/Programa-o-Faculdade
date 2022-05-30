from random import randint
c=set()
while(True):
    c.add(randint(1,50))
    print(c)
    if(len(c)==6):
        break
print(sorted(c))
