
package ue02;

class Wagen {
    
    public int erstzulassung;
    
    public int alter () {
        return 2020 - erstzulassung;
    }
    
    public void printAlter (int wieoft) {

        while (wieoft-- > 0) {
        System.out.println("Alter = " + alter());

        }
    }
}

public class Methoden {
    public static void main (String[] args) {
     
        Wagen golf = new Wagen();
        
        golf.erstzulassung = 2001;
        System.out.print ("Der Wagen ist " +golf.alter() +" Jahre alt\n\n");
        
        int a = 3;
        golf.printAlter(a);
    }
}
