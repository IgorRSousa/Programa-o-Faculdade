package Lista1;

public class E8_recebeFraseEremoveVogais {
    public static void main(String args[]){
        String frase="BAcharelado em Ciencia da ComputaçaO";
        String novaFrase="";
        for(int i=0; i<frase.length(); i++){
            char c=frase.toLowerCase().charAt(i);
            if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'))
                novaFrase+=frase.charAt(i);
            }
        System.out.println(frase);
        System.out.println("Frase sem as vogais: "+novaFrase);
}
}
