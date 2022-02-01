package vehiculo;

/**
 *
 * @author FS
 ** Programming cycle II - National University (UNAL)
 */
public class Particular extends Vehiculo{
    protected String color;
    
    public Particular(double vel, int pas, String placa, String tipo, 
            String color ){
        super(vel, pas, placa, tipo );
        this.color = color;
    };
    
    @Override
    public String toString(){
    return  "Vehiculo " + tipo + " - Placa: " + placa + 
                "\n\tvelocidad: " + vel + "km/h"+ 
                "\n\tpasajeros:  " + pas + 
                "\n\tcolor: " +color; 
    }
}
