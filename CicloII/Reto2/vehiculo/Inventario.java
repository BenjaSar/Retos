package vehiculo;

import java.util.List;
import java.util.Scanner;
import vehiculo.Comercial;
import vehiculo.Particular;
import java.util.ArrayList;

/**
 *
 * @author FS
 * Programming cycle II - National University of Colombia -- 2021
 */
public class Inventario {
    //Atributos
    //protected List<Vehiculo> listVehiculos;
    protected static ArrayList<Vehiculo> listVehiculos = new ArrayList<Vehiculo>();
    protected static String mOpciones = "0"; 
    
    public Inventario(ArrayList<Vehiculo> listVehiculos){
        this.listVehiculos = listVehiculos;
    }


    //Class methods
    public static void  agregarVehiculo(){
        String[]  entrada = mOpciones.split("&");
        if(entrada[1].equals("Comercial")){
            Comercial autonuevo = new Comercial(Double.parseDouble(entrada[3]), Integer.parseInt(entrada[2]), entrada[4], entrada[1], Double.parseDouble(entrada[5]));
            if(listVehiculos!= null){
                    listVehiculos.add(autonuevo);
            }
        }else if(entrada[1].equals("Particular")){
            //1&Particular&numeroPasajeros&velocidadMaxima&placa&color
            //Instanciacion del objeto tipo vehiculo particular      
            Particular autoNuevo = new Particular(Double.parseDouble(entrada[3]), Integer.parseInt(entrada[2]), entrada[4], entrada[1],entrada[5]);
                                listVehiculos.add(autoNuevo);     
        }
    }
    
     public static void listarVehiculos(){
        if(listVehiculos!= null){
            System.out.println("***Inventario de vehículos***");
            for( Vehiculo v : Inventario.listVehiculos) {
            System.out.println(v);
            }
        }
    }
    
    public static void  procesarComandos(){   

        Scanner sc = new Scanner(System.in);
        
        while(!mOpciones.equals("3")){
            mOpciones = sc.nextLine();
            
            if(mOpciones.charAt(0) == '1'){
                agregarVehiculo();
            } else if(mOpciones.charAt(0) == '2'){
                    listarVehiculos();
            }else{
               System.exit(0);
            }
          }
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        procesarComandos();
    }
}