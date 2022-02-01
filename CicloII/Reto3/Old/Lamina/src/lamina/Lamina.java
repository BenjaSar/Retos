
package lamina;

import java.util.ArrayList;

/**
 * Programming Cycle II - National University of Colombia 2021
 * Challenge III
 *Author: FS
 */
public class Lamina {
    public static ArrayList<String> laminasRepetidas = new ArrayList<String>();
    public static ArrayList<Integer>  nLaminasRepetidas = new ArrayList<Integer>();

    public static ArrayList<Integer> laminasFaltantes = new ArrayList<Integer>();
    public static ArrayList<String> tiposLaminas = new ArrayList<String>();
    
    
    public static ArrayList<String> clases(ArrayList<String> tiposLaminas){
    ArrayList<String> sinRepeticion = new ArrayList<String>();
    ArrayList<String> tLaminas = new ArrayList<String>();    
        for(String lamina: laminasRepetidas){
            for(String laminas: tLaminas ){
                if(laminasRepetidas.contains(lamina)!= tLaminas.contains(laminas)){
                    sinRepeticion.add(laminas);
                }
            }
        }   
        return sinRepeticion;
   }
    
    
    public static ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> numeroFaltantes,
            ArrayList<String> tLaminas, String tLamina){
            ArrayList<Integer> nFaltantes = new ArrayList<Integer>();
            for(String tipoLamina : tiposLaminas ){
                if(tiposLaminas.contains(tipoLamina)){
                    for(Integer nFaltante : numeroFaltantes){
                        if(!numeroFaltantes.contains(nFaltante)){
                            nFaltantes.add(nFaltante);
                        }
                    }
                }
            }
        
    return nFaltantes;
    }
    
    
    public static ArrayList<String> noTengo(ArrayList<String> lOtraPersona, 
            ArrayList<String> laminasPropias){
        ArrayList<String> meInteresan = new ArrayList<String>();
            for(String lop: lOtraPersona){
                if(!laminasPropias.contains(lop)){
                    meInteresan.add(lop);
                }
            }
    return meInteresan; 
    }
    
    
    public static Integer puedoCambiar(ArrayList<Integer> laminasOtraPersona, 
            ArrayList<Integer> lPropias){
            ArrayList<Integer> lOtraPersona = new ArrayList<Integer>();
            ArrayList<Integer> lCambiar = new ArrayList<Integer>();
            Integer numeroLaminas = 0;
            
            for(Integer repetidas: nLaminasRepetidas){
                for(Integer otraPersona: lOtraPersona){
                    if(nLaminasRepetidas.get(repetidas) != lOtraPersona.get(otraPersona)){
                        lCambiar.add(otraPersona);
                        numeroLaminas = lCambiar.size();
                    }
                }
            }
    return numeroLaminas;
    }
}

