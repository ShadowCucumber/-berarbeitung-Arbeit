public abstract class Medien {
    String titel;
    int FSK;
    int laenge;
    boolean verfuegbar;

    public Medien(String titel,int FSK, int laenge, boolean verfuegbar){
        setFSK(FSK);
        setLaenge(laenge);
        setTitel(titel);
        setVerfuegbar(verfuegbar);
    }
    public void setFSK(int fSK) {
        FSK = fSK;
    }   
    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }   
    public void setTitel(String titel) {
        this.titel = titel;
    }   
    public int getFSK() {
        return FSK;
    }
    public int getLaenge() {
        return laenge;
    }
    public String getTitel() {
        return titel;
    }
    public void setVerfuegbar(boolean verfuegbar) {
        this.verfuegbar = verfuegbar;
    }
    public boolean getVerfuegbar(){
        return verfuegbar;
    }
    public abstract void Daten();

    
}
