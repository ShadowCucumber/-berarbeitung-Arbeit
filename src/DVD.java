public class DVD extends Medien{
    boolean fullHD;


    public DVD(String titel, int FSK, int laenge, boolean fullHD, boolean verfuegbar){
        super(titel, FSK, laenge, verfuegbar);
        setFullHD(fullHD);
    }

    public void setFullHD(boolean fullHD) {
        this.fullHD = fullHD;
    }
    public boolean getfullHD() {
        return fullHD;
    }
    public void Daten(){
        System.out.println(getFSK() + " " + getLaenge() + " " + getTitel() + " " + getfullHD());
    }
}
