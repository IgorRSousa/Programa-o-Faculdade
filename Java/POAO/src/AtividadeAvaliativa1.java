import java.util.Date;
import javax.swing.JOptionPane;

interface Radio{
    int getBanda();
    void setBanda(int Banda);
    float getSintonia();
    void setSintonia(float Frequencia);
    int getVolumeRadio();
    void setVolumeRadio(int vol);
    void ligaRadio();
    void desligaRadio();
}

interface Relogio{
    String getHorario();
    String getAlarme();
    void setAlarme(int Hora, int Min);
    void ligaAlarme();
    void desligaAlarme();
    int getStatusAlarme();
    int getVolumeAlarme();
    void setVolumeAlarme(int vol);
}

class RadioRelogio implements Relogio, Radio{
    private int Banda;
    private int volumeRadio;
    private int volumeAlarme;
    private float Frequencia;
    private int horaAlarme;
    private int minutoAlarme;
    private boolean alarmeLigado;
    private boolean radioLigado;

    public RadioRelogio(int Banda, int volumeRadio, int volumeAlarme, float Frequencia){
        this.Banda = Banda;
        this.volumeRadio = volumeRadio;
        this.volumeAlarme = volumeAlarme;
        this.Frequencia = Frequencia;
        this.alarmeLigado = false;
    }
    //Gets
    @Override
    public int getBanda() {
        return Banda;
    }
    @Override
    public float getSintonia() {
        return Frequencia;
    }
    @Override
    public int getVolumeRadio() {
        return volumeRadio;
    }
    @Override
    public String getHorario(){
        Date hoje = new Date();
	return hoje.getHours()+":"+hoje.getMinutes();

    }
    @Override
    public String getAlarme(){
        String A =(horaAlarme+":"+minutoAlarme);
        return A;
    }
    @Override
    public int getStatusAlarme(){
        if(alarmeLigado){
            return 1;
        }else{
            return 0;
        }
    }
    @Override
    public int getVolumeAlarme(){
        return volumeAlarme;
    }
    //Sets
    @Override
    public void setBanda(int Banda){
        this.Banda = Banda;
    }
    @Override
    public void setSintonia(float Frequencia){
        if(radioLigado){
            this.Frequencia = Frequencia;
        }else{
            JOptionPane.showMessageDialog(null,"!!Radio deslidado!!");
        } 
    }
    @Override
    public void setVolumeRadio(int vol){
        if(radioLigado){
            this.volumeRadio = vol;
        }else{
            JOptionPane.showMessageDialog(null,"!!Radio deslidado!!");
        }
    }
    @Override
    public void setAlarme(int Hora, int Min){
        this.horaAlarme = Hora;
        this.minutoAlarme = Min;
    }
    @Override
    public void setVolumeAlarme(int vol){
        this.volumeAlarme = vol;
    }
    @Override
    public void ligaAlarme() {
        this.alarmeLigado = true;
    }
    @Override
    public void desligaAlarme() {
        this.alarmeLigado = false;
    }
    @Override
    public void ligaRadio() {
        this.radioLigado = true;
    }
    @Override
    public void desligaRadio() {
        this.radioLigado = false;
    }
}

public class AtividadeAvaliativa1 {
    public static void main(String args[]){
        RadioRelogio A = new RadioRelogio(0, 50, 50, (float)101.5);
        A.ligaRadio();
        A.setVolumeRadio(70);
        A.setSintonia((float)108.0);
        A.setAlarme(8,30);
        A.ligaAlarme();
        A.setVolumeAlarme(100);
        JOptionPane.showMessageDialog(null,"Banda(0-FM | 1-AM): "+A.getBanda()+"\nFrequencia: "+A.getSintonia()+"\nVolume radio: "+A.getVolumeRadio()+"\nHora: "+A.getHorario()+"\nStatus alarme: "+ A.getStatusAlarme()+"\nHora alarme: "+A.getAlarme()+"\nVolume aarme: "+A.getVolumeAlarme());
    }
}
