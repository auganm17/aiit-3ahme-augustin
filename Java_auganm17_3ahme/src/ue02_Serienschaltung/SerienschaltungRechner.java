package ue02_Serienschaltung;

import java.util.Scanner;

public class SerienschaltungRechner {
    public static void main (String[] args) {
        
        final Serienschaltung serienschaltung = new Serienschaltung();
        Scanner scanner = new Scanner(System.in);
    }
    
    while (true) {
        try {
            System.out.print("current: ");
            final double strom = scanner.nextDouble();
            serienschaltung.setStrom(strom);
            break;
        } catch () {

        }
    }

}
