public class Verwarnung {
    String grund;
    String datum;

    public Verwarnung(String grund, String datum){
        setDatum(datum);
        setGrund(grund);
    }
    public void setDatum(String datum) {
        this.datum = datum;
    }
    public void setGrund(String grund) {
        this.grund = grund;
    }
    public String getDatum() {
        return datum;
    }
    public String getGrund() {
        return grund;
    }

    
}