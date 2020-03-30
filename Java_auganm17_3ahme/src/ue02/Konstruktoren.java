
package ue02;

public class Konstruktoren {
        
        public String name;
        public int erstzulassung;
        public int leistung;

        public Konstruktoren (String name) {
         this.name = name;
        }

        public Konstruktoren (String name, int erstzulassung, int leistung) {

            this.name = name;
            this.erstzulassung = erstzulassung;
            this.leistung = leistung;
        }
}

// Ist nur ein Teilprogramm, deshalb die "error"....
