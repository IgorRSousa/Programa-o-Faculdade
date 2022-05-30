package Lista2;

public class E1_progRetangulo {
    public static void main(String args[]){
        E1_paramterRetangulo ret = new E1_paramterRetangulo(5, 3);
        System.out.println("Altura: "+ ret.altura+"\nBase: "+ret.base);
        System.out.println("Area: "+ ret.calculaArea());
        System.out.println("Area: "+ ret.calculaPerimetro());
}
}
