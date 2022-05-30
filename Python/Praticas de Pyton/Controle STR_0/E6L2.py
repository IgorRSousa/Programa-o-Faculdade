f = input("Insira uma frase que será criptografada: ")

tam=len(f)

fl=[]

for i in range(tam):
    carac = f[i]
    carac = chr(ord(carac) + 3)
    fl.append(carac)

rf = "".join(fl)

print(rf)
