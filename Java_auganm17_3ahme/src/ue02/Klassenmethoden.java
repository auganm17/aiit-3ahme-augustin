
package ue02;

public class Klassenmethoden {
    public static void main (String[] args) {
        
        double x;
        double y;
     
        for (x = 0.0; x <= 10.0; x = x + 1.0) {
            y = Math.sqrt(x);
            System.out.println("sqrt("+x+") = "+y);
        }
    }
}
