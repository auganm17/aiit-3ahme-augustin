
package ue02;

class Auto {
    
    public String name;
    public int erstzulassung;
    public int leistung;
   
}

public class Klassen_und_Objekte {
    public static void main (String[] args) {
        
        Auto michaelsAuto = new Auto();
        
        michaelsAuto.name = "Mercedes 600";
        michaelsAuto.erstzulassung = 1972;
        michaelsAuto.leistung = 250;
        
        Auto meinWagen = new Auto();
        
        meinWagen.name = "Peugeot 206";
        meinWagen.erstzulassung = 2000;
        meinWagen.leistung = 60;
        
        System.out.println ("Name........: " +michaelsAuto.name);
        System.out.println ("Zugelassen..: " +michaelsAuto.erstzulassung);
        System.out.println ("Leistung....: " +michaelsAuto.leistung +" PS\n");
        
        System.out.println ("Name........: " +meinWagen.name);
        System.out.println ("Zugelassen..: " +meinWagen.erstzulassung);
        System.out.println ("Leistung....: " +meinWagen.leistung +" PS");
    }
}
