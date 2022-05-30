"x**y"
def elevado(x,y):
    if(y<=2):
        return x*x
    return x * elevado(x,y-1)
print(elevado(5,6))
        
    
