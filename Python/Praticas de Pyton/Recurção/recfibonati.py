def fibonatirec(x):
    if (x<=2):
        return 1
    return fibonatirec(x-1) + fibonatirec(x-2)

print(fibonatirec(7))
