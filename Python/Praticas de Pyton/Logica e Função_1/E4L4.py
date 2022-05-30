def validaEntrada(num,base):
    for i in range(len(num)):
        if base == 16:
            if num[i] not in '0123456789ABCDEF':
                return False
        else:
            if int(num[i]) >= base:
                return False
    return True

def decToqq(num,base):
    l = []
    num = int(num)
    while num != 0:
        if num % base >= 10:
           l.appe2nd(chr((num % base) + 55))
        else:
            l.append(num % base)
        num //= base
    l = l[::-1]
    l = [str(n) for n in l]
    num = "".join(l)
    return num

def qqTodec(num,base):
    dec = 0
    j = len(num)-1
    for i in range(len(num)):
        if base == 16:
            if num[i] in 'ABCDEF':
                dec += (ord(num[i])-55)*base ** j
            else:
                dec += int(num[i])*base ** j
        else:
            dec += int(num[i]) * base ** j
        j -= 1
    return dec

baseO = int(input("Informe a base inicial: "))
while True:
    numero = input("Informe o número que deseja converter: ").upper()
    if baseO == 16:
        if numero.isalnum() and validaEntrada(numero, baseO):
            break
        else:
            print(f"Números inválidos para a base {baseO}")
    elif numero.isdigit():
        if validaEntrada(numero, baseO):
            break
        else:
            print(f"Números inválidos para a base {baseO}")
    else:
        print("Informe apenas números")

baseD = int(input("Informe a base final: "))
if baseO != 10 and baseD != 10:
    dec = qqTodec(numero,baseO)
    conv = decToqq(dec,baseD)
elif baseO == 10:
    conv = decToqq(numero,baseD)
else:
    conv = qqTodec(numero, baseO)

print(f"O número {numero} na base {baseO} é {conv} na base {baseD}")
