'frase = "pbpopm pdpipa pspepnphpopr pppopdpe pfpaplpapr" ' 
frase = "pVpapmpops pppaprpa pcpipnpepmpa"
frase.lower()
ant=0
n=0

decfrase = []
cont=len(frase)

for i in range (cont):
    n=frase.find("p",i)
    if (n != i) or (n != ant):
        decfrase.append(frase[i])

    ant=n

print(decfrase)
