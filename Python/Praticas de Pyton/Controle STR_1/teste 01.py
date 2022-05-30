def colet(L):
    msg=[]
    uni=[]
    n=0
    for i in range(2):
        for j in range(len(L[0])):
            uni.append(L[i][j])
    
    print(uni)
    for i in range(len(uni)):
        if uni[i] <= 26:
            n= uni[i] + 64
            print(f'{chr(n)}',end="")
        elif uni[i] == 27:
            print(f'{chr(uni[i]+19)}',end="")
        elif uni[i] == 28:
            print(f'{chr(uni[i]+5)}',end="")
        elif uni[i] == 29:
            print(f'{chr(uni[i]+6)}',end="")
        else:
            print(f'{chr(uni[i])}',end="")

colet([[5,21,29,1,3,18,5,4,9,20,15,29],[14,1,29,5,4,21,3,1,3,1,15,27]])
