public class Schallplatte extends Medien {
    boolean verleibar;

    public Schallplatte(String titel,int FSK, int laenge, boolean verleibar,boolean verfuegbar){
        super(titel, FSK, laenge, verfuegbar);
        setVerleibar(verleibar);
    }
    public void setVerleibar(boolean verleibar) {
        this.verleibar = verleibar;
    }
    public boolean getverleibar() {
        return verleibar;
    }
    public void Daten(){
        System.out.println(getFSK() + " " + getLaenge() + " " + getTitel() + " " + getverleibar());
    }
    
}
