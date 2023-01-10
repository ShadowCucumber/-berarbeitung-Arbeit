public class BluRay extends Medien{
    boolean dreiD;


    public BluRay(String titel,int FSk,int laenge, boolean dreiD, boolean verfuegbar){
        super(titel, FSk, laenge, verfuegbar);
        setDreiD(dreiD);

    }

    public void setDreiD(boolean dreiD) {
        this.dreiD = dreiD;
    }
    public boolean getdreiD() {
        return dreiD;
    }
    public void Daten(){
        System.out.println(getTitel() + " " + getFSK() + " " + getLaenge() + " " + getdreiD());
    }
    
}
