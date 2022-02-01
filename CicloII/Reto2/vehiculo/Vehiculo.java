
package vehiculo;

/**
 *
 * @author benjas
 */
public abstract class  Vehiculo {
    //Definicion de atributos
        protected double vel;
        protected int pas;
        protected String placa;
        protected String tipo;
    
        //Constructor
        public Vehiculo(double vel, int pas, String placa, String tipo ){
        this.vel = vel;
        this.pas = pas;
        this.placa = placa;
        this.tipo = tipo;
        }
        
        //Metodos de clase
    
}
