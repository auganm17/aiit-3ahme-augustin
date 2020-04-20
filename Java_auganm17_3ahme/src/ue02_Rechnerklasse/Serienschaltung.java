package ue02_Rechnerklasse;


public class Serienschaltung {

    private double strom;
    private double spannung;
    private double[] widerstandFeld;


    public void updateSpannung () {
        if (widerstandFeld == null) {
            spannung = 0;
        }
        else {
            for (int i = 0; i < widerstandFeld.length; i++) {
                spannung += strom * widerstandFeld[];
            }
        }
    }


    public void addWiderstand (double widerstandInOhm) {
        if (widerstandFeld == null) {
            widerstandFeld = new double[1];
            widerstandFeld[0] = widerstandInOhm;
        } else {
            tmp = new double [widerstandFeld.length];
            System.arraycopy (widerstandFeld, 0, tmp, 0, widerstandFeld.length);
            widerstandFeld = new double [widerstandFeld.length + 1];
            System.arraycopy (tmp, 0, widerstandFeld, 0, widerstandFeld.length);
            widerstandFeld[widerstandFeld.length] = widerstandInOhm;
        }
        updateSpannung();

    }


    public double getStrom () {
        return strom;
    }


    public double getSpannung () {
        return spannung;
    }


    public void setStrom (double strom) {
        this.strom = strom;
        updateSpannung();
    }


    @Override
    public String toString () {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandsFeld=" + widerstandsFeld + '}';
    }
}
