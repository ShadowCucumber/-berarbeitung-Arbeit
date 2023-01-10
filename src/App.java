import java.util.ArrayList;



public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Buchung> buchungen = new ArrayList<>();
        ArrayList<Medien> gesamtmedien = new ArrayList<>();
        ArrayList<Schallplatte> gesamtschallplatten = new ArrayList<>();


        //Aufgabe 1

        Kunde k1 = new Kunde(12, 11, "Henrik", "Henzel");
        Kunde k2 = new Kunde(11, 18, "Rick", "Roll");
        DVD d1 = new DVD("Matrix 4", 12, 180, true, true);
        Schallplatte s1 = new Schallplatte("Mozart", 0, 60, false, false);
        Schallplatte s2 = new Schallplatte("Mozart 2 ", 0, 70, true, true);

        buchungen.add(new Buchung(k1, d1));
        buchungen.add(new Buchung(k2, s2));
        buchungen.add(new Buchung(k1, d1));
        buchungen.add(new Buchung(k2, s1));
        buchungen.add(new Buchung(k1, s2));

        int index = 0;
        for(Buchung buchung : buchungen){


        if (buchung.getKunde().getAlter() < buchung.getMedien().getFSK()) {
            System.out.println("Kunde ist nicht alt genug");
            buchungen.remove(index);
        } else 
            if (buchung.getKunde().getMaxausleihen().length > 5) {
                System.out.println("Kunde darf nicht mehr als 5 Medien ausleihen");
                buchungen.remove(index);
            } else {
                System.out.println("Kunde hat alle anforderungen erfüllt und hat erfolgreich ausgeliehen");
                buchung.getKunde().getMaxausleihen()[buchung.getKunde().getMaxausleihen().length] = buchung.getMedien();
                
            }
            public static void testWarnung(){
                Kunde k3 = new Kunde(12, 16, "Hans", "Baum");
                Kunde k4 = new Kunde(14, 19, "Gühnter", "Petersen");
                Schallplatte s3 = new Schallplatte("Mozart 2", 0, 70, true, true);
                BluRay b1 = new BluRay("Oben", 0, 130, false, true);

                buchungen.add(new Buchung(k3, b1));
                buchungen.add(new Buchung(k3, s3));
                buchungen.add(new Buchung(k4, s3));
                buchungen.add(new Buchung(k4, b1));

                Verwarnung v1 = new Verwarnung("Zu spaet", "12.19.22");
                Verwarnung v2 = new Verwarnung("Kaputt", "13.18.44");
                Verwarnung v3 = new Verwarnung("Kaputt", "13.15.22");
                Verwarnung v4 = new Verwarnung("Zu spaet", "18.7.22");

                k3.getVerwarungen().add(v2);
                k1.getVerwarungen().add(v4);
                k2.getVerwarungen().add(v3);
                k4.getVerwarungen().add(v1);


                //Aufgabe 3

                public static void gesamtmedien(){
                    int m = 1
                    for(Medien medien : getMedien()){
                        System.out.println(m + ".");
                        m++;
                    }
                }

                public static void ueberschreibeAusleihe(boolean Wert){
                    for(Medien medien : getMedien()){
                        medien.setVerfuegbar(Wert);
                    }
                    System.out.println("Erfolgreich überschrieben!");

                    
                

    



            }
            
            
        }
    }
    }


