import java.util.ArrayList;

public class Kunde extends Mensch {
    int kundennummer;
    int alter;
    Medien[] maxausleihen = new Medien[4];
    ArrayList<Verwarnung> verwarungen = new ArrayList<>();



    public Kunde(int kundennummer,int alter,String vorname,String nachname){
        super(vorname, nachname);
        setAlter(alter);
        setKundennummer(kundennummer);

    }
    
    public void setAlter(int alter) {
        this.alter = alter;
    }   
    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }   
    public int getAlter() {
        return alter;
    }   
    public int getKundennummer() {
        return kundennummer;
    }   
    public void setMaxausleihen(Medien[] maxausleihen) {
        this.maxausleihen = maxausleihen;
    }
    public Medien[] getMaxausleihen() {
        return maxausleihen;
    }
    public void setVerwarungen(ArrayList<Verwarnung> verwarungen) {
        this.verwarungen = verwarungen;
    }
    public ArrayList<Verwarnung> getVerwarungen() {
        return verwarungen;
    }

    public Medien getMedien() {
        return null;
    }

    

    
}
