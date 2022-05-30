
import javax.swing.JOptionPane;


class Pessoa{
    private String Nome;
    private int Idade;

    public Pessoa(String Nome, int Idade) {
        this.Nome = Nome;
        this.Idade = Idade;
    }
    
    public String getNome() {
        return Nome;
    }
    public int getIdade() {
        return Idade;
    }
}

abstract class PessoaIMC extends Pessoa{
    private float Peso;
    private float Altura;

    public PessoaIMC(float Peso, float Altura, String Nome, int Idade) {
        super(Nome, Idade);
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public float getPeso() {
        return Peso;
    }
    public float getAltura() {
        return Altura;
    }
    public void setPeso(float Peso) {
        this.Peso = Peso;
    }
    public void setAltura(float Altura) {
        this.Altura = Altura;
    }
    
    public float calculaIMC(){
        return Peso/(Altura*Altura);
    }
    public abstract String resultadoIMC();
}

class Homem extends PessoaIMC{
    private String Time;

    public Homem(String Time, float Peso, float Altura, String Nome, int Idade) {
        super(Peso, Altura, Nome, Idade);
        this.Time = Time;
    }
    
    public String getTime() {
        return Time;
    }
    public void setTime(String Time) {
        this.Time = Time;
    }
    
    @Override
    public String resultadoIMC(){
        float A;
        A = calculaIMC();
        if(A < 20.7){
            return "Abaixo do peso ideal";
        }else{
            if(A < 26.4){
                return "Peso ideal";
            }else{
                return "Acima do peso ideal";
            }
        }
    }
}

class Mulher extends PessoaIMC{
    private String Signo;

    public Mulher(String Signo, float Peso, float Altura, String Nome, int Idade) {
        super(Peso, Altura, Nome, Idade);
        this.Signo = Signo;
    }

    public String getSigno() {
        return Signo;
    }
    public void setSigno(String Signo) {
        this.Signo = Signo;
    }

    @Override
    public String resultadoIMC(){
        float A;
        A = calculaIMC();
        if(A < 19){
            return "Abaixo do peso ideal";
        }else{
            if(A < 25.8){
                return "Peso ideal";
            }else{
                return "Acima do peso ideal";
            }
        }
    }
}

public class AtividadeAvaliativa2 {
    public static void main(String args[]){
        Homem H = new Homem("Sao Paulo", (float)68.4, (float)1.71,"Romero Capim", 25);
        Mulher M = new Mulher("Leao", (float)70.5, (float)1.55,"Luana Palha", 22);
        
        JOptionPane.showMessageDialog(null,"Nome: "+H.getNome()+"\nIdade: "+H.getIdade()+"\nPeso: "+H.getPeso()+"\nAltura: "+H.getAltura()+"\nTime: "+ H.getTime());
        JOptionPane.showMessageDialog(null,"Nome: "+M.getNome()+"\nIdade: "+M.getIdade()+"\nPeso: "+M.getPeso()+"\nAltura: "+M.getAltura()+"\nSigno: "+ M.getSigno());
        
        if(H.getPeso() < M.getPeso()){
            JOptionPane.showMessageDialog(null,"Pessoa mais pesada:\n"+"Nome: "+M.getNome()+"\nPeso: "+M.getPeso());
        }else{
            JOptionPane.showMessageDialog(null,"Pessoa mais pesada:\n"+"Nome: "+H.getNome()+"\nPeso: "+H.getPeso());
        }
        if(H.getAltura() < M.getAltura()){
            JOptionPane.showMessageDialog(null,"Pessoa mais alta:\n"+"Nome: "+M.getNome()+"\nPeso: "+M.getAltura());
        }else{
            JOptionPane.showMessageDialog(null,"Pessoa mais alta:\n"+"Nome: "+H.getNome()+"\nPeso: "+H.getAltura());
        }
    }
}
