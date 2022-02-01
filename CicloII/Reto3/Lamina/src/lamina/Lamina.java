
package lamina;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Programming Cycle II - National University of Colombia 2021
 * Challenge III
 *Author: FS
 */
public class Lamina {
    public static ArrayList<Integer> laminasRepetidas = new ArrayList<Integer>();
    public static ArrayList<Integer> tiposLaminas = new ArrayList<Integer>();
    
    
    public static ArrayList<Integer> clases(ArrayList<Integer> tiposLaminas){
    ArrayList<Integer> sinRepeticion = new ArrayList<Integer>();
        for(Integer lamina: tiposLaminas){
            if(!sinRepeticion.contains(lamina)){
                sinRepeticion.add(lamina);
            }  
        }   
        return sinRepeticion;
   }
    
    public static ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> numeroFaltantes,
        ArrayList<Integer> tLaminas, int cLamina){
        ArrayList<Integer> nFaltantes = new ArrayList<Integer>();
        
                for(int index = 0; index< numeroFaltantes.size(); index++){
                    int numeroActual = numeroFaltantes.get(index);
                        if(tLaminas.get(numeroActual) == cLamina){
                            nFaltantes.add(numeroActual);
                    }
                }
    return nFaltantes;
    }
    
    public static ArrayList<Integer> noTengo(ArrayList<Integer> lOtraPersona, 
            ArrayList<Integer> laminasPropias){
        ArrayList<Integer> meInteresan = new ArrayList<Integer>();
            for(Integer lop: lOtraPersona){
                if(!laminasPropias.contains(lop)){
                    meInteresan.add(lop);
                }
            }
    return meInteresan; 
    }
    
    public static Integer puedoCambiar(ArrayList<Integer> laminasOtraPersona, 
            ArrayList<Integer> lPropias){
            
            ArrayList<Integer>lCambiarFinal1 = new ArrayList<Integer>();
            ArrayList<Integer>lCambiarFinal2 = new ArrayList<Integer>();
                  
                  for(Integer lp : laminasOtraPersona){
                      if(!lPropias.contains(lp)){
                          lCambiarFinal1.add(lp);
                      }
                  };
                  for(Integer lop : lPropias){
                      if(!laminasOtraPersona.contains(lop)){
                          lCambiarFinal2.add(lop);
                      }
                  };
            Integer sizeF = Math.min(lCambiarFinal1.size(), lCambiarFinal2.size());
    return sizeF;
    }
}

