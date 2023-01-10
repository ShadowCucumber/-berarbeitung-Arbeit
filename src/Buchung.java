public class Buchung {
    Kunde kunde;
    Medien medien;

    public Buchung(Kunde kunde, Medien medien){
        setKunde(kunde);
        setMedien(medien);
    }
    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
    public void setMedien(Medien medien) {
        this.medien = medien;
    }
    public Kunde getKunde() {
        return kunde;
    }
    public Medien getMedien() {
        return medien;
    }

    
}
