
package projekt_augustin;

public class Resistor extends Component{

    public Resistor(double value) {
        super("R?", value);
    }
    
    public Resistor(String id, double value) {
        super(id, value);
    }

    @Override
    public String unit () {
        return "\u2126";
    }

    @Override
    public double energy () {
        return 0;
    }
    
}
