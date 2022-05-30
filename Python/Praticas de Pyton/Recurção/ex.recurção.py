def fatrec (x):
    if (x==1):
        return 1
    return x*fatrec(x-1)

print(fatrec(5))
