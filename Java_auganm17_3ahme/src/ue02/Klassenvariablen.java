
package ue02;

public class Klassenvariablen {
    static private int objcnt = 0;
 
    public Klassenvariablen () {// Klassenvariable steht für ein Testauto!
        ++objcnt;
    }
 
    public void finalize () {
        --objcnt;
    }
 
    public static void main(String[] args)
    {
        Klassenvariablen auto1;
        Klassenvariablen auto2 = new Klassenvariablen();
        System.out.println("Anzahl Testauto-Objekte: " + Klassenvariablen.objcnt);
    }
}
