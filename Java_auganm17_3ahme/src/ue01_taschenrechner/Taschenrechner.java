
package ue01_taschenrechner;

public class Taschenrechner {
    
    double a;
    double b;
    
    public Taschenrechner (double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double getAdditionsResult () {
        return a - b;
    }
    
    public double getSubtraktionResult () {
        return a - b;
    }
    
    public double getMultiplikationResult () {
        return a * b;
    }
    
    public double getDivisionResult () {
        return a / b;
    }
}
