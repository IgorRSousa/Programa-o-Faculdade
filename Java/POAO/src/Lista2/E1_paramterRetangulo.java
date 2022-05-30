package Lista2;

public class E1_paramterRetangulo {
    int base,altura;
    public E1_paramterRetangulo (int b, int a){
        base=b;
        altura=a;
    }
    int calculaArea(){
        return altura*base;
    }
    int calculaPerimetro(){
        return ((2*altura)+(2*base));
    }
}