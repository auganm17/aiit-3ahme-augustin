
package ue01_taschenrechner;

import java.util.Scanner;

public class TestTaschenrechner {
    public static void main (String[] args) {
        
        Scanner scannerVariable = new Scanner(System.in);
        
        System.out.print("Wert a: ");
        final double a = scannerVariable.nextDouble();
        System.out.print("Wert b: ");
        final double b = scannerVariable.nextDouble();
        
        Taschenrechner taschenrechner = new Taschenrechner (a, b);
        
        System.out.println("   Addition: " +taschenrechner.getAdditionsResult());
        System.out.println("   Subtraktion: " +taschenrechner.getSubtraktionResult());
        System.out.println("   Multiplikation: " +taschenrechner.getMultiplikationResult());
        System.out.println("   Division: " +taschenrechner.getDivisionResult());
        
    }
}
