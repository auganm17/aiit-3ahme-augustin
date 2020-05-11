
package ue02_Serienschaltung;

import java.util.logging.Level;

public class TestSerienschaltung {
    
    public static void main (String[] args) {
        final Serienschaltung ss = new Serienschaltung();

        try {
            System.out.println("1: " + ss);
            ss.addWiderstand(10);
        }
        catch (Exception ex) {
            System.out.println("Fehler aufgetreten");
            System.out.println(ex.getMessage());
            if (ex instanceof InvalidResistorValueException) {
            double v = ((InvalidResistorValueException)ex).getInvalidValue();
            }
            throw new TestFailedException(ex);
        }
        
        System.out.println("2: " + ss);
        ss.setStrom(0.5);
     
        try {
            System.out.println("3: " + ss);
            ss.addWiderstand(15);
        }
        catch (Exception ex) {
            System.out.println("Fehler aufgetreten");
            System.out.println(ex.getMessage());
        }
        
        try {
            System.out.println("4: " + ss);
            ss.addWiderstand(20);
        }
        catch (Exception ex) {
            System.out.println("Fehler aufgetreten");
            System.out.println(ex.getMessage());
        }
        System.out.println("5: " + ss);

        ss.setStrom(1);
        System.out.println("6: " + ss);
    }

    public static class TestFailedException extends RuntimeException {

        public TestFailedException (Throwable cause) {
            super(cause);
        }
    
    }
    
}
