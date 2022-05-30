package Lista1;

public class E7_Numeros_de_vogais_na_fase {
    public static void main(String args[]){
        String frase="BAcharelado em Ciencia da ComputaçaO";
        int vogais=0;
        for(int i=0; i<frase.length(); i++){
            char c=frase.toLowerCase().charAt(i);//charat puxa uma letra especifia de uma srting por su indici no caso agr i
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                vogais++;
    }
    System.out.println("A frase '"+frase.toUpperCase()+"' tem "+vogais+" vogais!");
}
}  