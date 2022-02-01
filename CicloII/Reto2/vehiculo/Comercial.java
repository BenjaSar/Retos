package vehiculo;

/**
 *
 * @author FS
 * Programming cycle II - National University (UNAL)
 */
public class Comercial extends Vehiculo{
        protected double cargaM;
    
        public Comercial(double vel, int pas, String placa, String tipo, 
                double cargaM){
        super(vel, pas, placa, tipo );
        this.cargaM = cargaM;
    };
        
        @Override
        public String toString(){
        return  "Vehiculo " + tipo + " - Placa: " + placa + 
                "\n\tvelocidad: " + vel + "km/h"+ 
                "\n\tpasajeros:  " + pas + 
                "\n\tcarga máxima: " + cargaM +"kg";
    }
}
