import java.util.ArrayList;
import java.util.Scanner;


class Boleto
{
    private String dataDeVencimento;
    private String dataDePagamento;
    private boolean pago;
    private float valor;
    private int numero;

    public Boleto(int numero, String dataDeVencimento, float valor)
    {
        this.dataDeVencimento = dataDeVencimento;
        this.numero = numero;
        this.valor = valor;
        this.pago = false;
    }
    public void pagar(String dataDePagamento)
    {
        this.dataDePagamento = dataDePagamento;
        this.pago = true;
    }
    public float getValor()
    {
        return this.valor;
    }
    public int getNumero()
    {
        return this.numero;
    }
    public String getDataDeVencimento()
    {
        return this.dataDeVencimento;
    }
    public String getDataDePagamento()
    {
        return this.dataDePagamento;
    }
    public boolean getPago()
    {
        return this.pago;
    }
}

class Aluno
{    
    private ArrayList<Boleto> mensalidades;
    private String curso;
    private String nome;
    private String RA;

    public Aluno(String RA, String nome, String curso)
    {
        this.mensalidades = new ArrayList<Boleto>();
        this.curso = curso;
        this.nome = nome;
        this.RA = RA;
    }
    public String getRA()
    {
        return this.RA;
    }
    public String getNome()
    {
        return this.nome;
    }
    public Boleto getMensalidade(int numero)
    {
        for (Boleto boleto : this.mensalidades)
        {
            if(boleto.getNumero() == numero) return boleto;
        }
        return null;
    }
    public void setMensalidade(int numero, String dataDeVencimento, float valor)
    {
        Boleto novoBoleto = new Boleto(numero, dataDeVencimento, valor);
        this.mensalidades.add(novoBoleto);
    }
    public void pagarMensalidade(int numero, String dataDePagamento)
    {
        for (Boleto boleto : this.mensalidades)
        {
            if(boleto.getNumero() == numero)
            {
                boleto.pagar(dataDePagamento);
            }
        }
    }
}

public class ExLista6
{
    public static void main(String[] args)
    {
        Aluno aluno = new Aluno("608599", "Fernando Hiibner", "Ciencia da Computacao");
        String[] datasDeVencimento = {"15/05/2021", "15/06/2021", "15/07/2021", "15/08/2021"};
        for(int i = 1; i < 5; i++)
        {  
            aluno.setMensalidade(i, datasDeVencimento[i-1], 690.0F);
        }
        aluno.pagarMensalidade(1, "10/05/2021");
        aluno.pagarMensalidade(2, "11/05/2021");
        for(int i = 1; i < 5; i++)
        {  
            Boleto mensalidade = aluno.getMensalidade(i);
            System.out.println("-------------------------------");
            System.out.println("Numero............: "+mensalidade.getNumero());
            System.out.println("Data de Vencimento: "+mensalidade.getDataDeVencimento());
            System.out.println("Valor.............: "+mensalidade.getValor());
            if (mensalidade.getPago())
            {
                System.out.println("Pago..............: Sim");
                System.out.println("Data de Pagamento.: "+mensalidade.getDataDePagamento());
            }
            else
            {
                System.out.println("Pago..............: Nao");
            }
            System.out.println("-------------------------------");
        }
    }
}