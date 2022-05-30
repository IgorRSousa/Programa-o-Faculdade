a=list(a)
c=[]
b=[]
for i in range(len(a)):
    if(a[i]=='.'):
        c.append(int("".join(b)))
        b=[]
    elif(a[i]!=','):
        b.append((a[i]))
    else:
        c.append(int("".join(b)))
        b=[]
print(c)
