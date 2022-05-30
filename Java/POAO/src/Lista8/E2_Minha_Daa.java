package Lista8;

interface MinhaData{
    int getDia();
    int getMes();
    int getAno();
    void setDia(int dia);
    void setMes(int mes);
    void setAno(int ano);
    String mostrarData();
}
class Data implements MinhaData{
    private int dia, mes, ano;
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }
    public void setDia(int dia) {
        if(dia<=31)
            this.dia = dia;
    }
    public void setMes(int mes) {
        if(mes<=12)
            this.mes = mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String mostrarData(){
        String meses[]={"janeiro", "fevereiro","março", "abril","maio",
        "junho", "julho", "agosto","setembro", "outubro","novembro","dezembro"};
        return this.dia+" de "+meses[this.mes-1]+ " de "+this.ano;
    }
}

public class E2_Minha_Daa {
        public static void main(String args[]){
        Data d=new Data();
        d.setDia(26);
        d.setMes(5);
        d.setAno(2021);
        System.out.println("Data: "+d.mostrarData());
    }
}
