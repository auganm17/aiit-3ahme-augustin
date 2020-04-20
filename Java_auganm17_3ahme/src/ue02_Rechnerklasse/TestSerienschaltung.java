
package ue02_Rechnerklasse;

public class TestSerienschaltung {
    
    public static void main (String[] args) {
        final Serienschaltung ss = new Serienschaltung();

        System.out.println("1: " + ss);
        ss.addWiderstand(10);
        System.out.println("2: " + ss);
        ss.setStrom(0.5);
        System.out.println("3: " + ss);
        ss.addWiderstand(15);
        System.out.println("4: " + ss);
        ss.addWiderstand(20);
        System.out.println("5: " + ss);

        ss.setStrom(1);
        System.out.println("6: " + ss);
    }

}
