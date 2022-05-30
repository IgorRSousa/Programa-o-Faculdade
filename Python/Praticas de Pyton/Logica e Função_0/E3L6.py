def indices_pares (w):
    return [w[i] for i in range(0,(len(w)),2)]

w=[1,2,4,6,3,65,8]
print(indices_pares (w))
