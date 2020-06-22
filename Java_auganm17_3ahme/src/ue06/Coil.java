
package projekt_augustin;

public class Coil extends Component{
    
    public Coil(double value) {
        super("L?", value);
    }
    
    public Coil(String id,double value) {
        super(id, value);
    }

    @Override
    public String unit () {
        return "H";
    }

    @Override
    public double energy () {
        return super.getCurrent () * Math.pow (super.getCurrent (), 2) /2;
    }
    
}
