/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamina;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author benjas
 */
public class prueba {
    
     public static void main(String[] args) {
        ArrayList<Integer> tLaminas = 
            new ArrayList<Integer>(Arrays.asList(2, 1, 1, 2, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 
                                2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1)); 
        int cLamina = 2;
        ArrayList<Integer> numeroFaltantes = 
            new ArrayList<Integer>(Arrays.asList(0, 17, 24, 3, 11, 25, 27, 14, 7, 30));
        ArrayList<Integer> nFaltantes = new ArrayList<Integer>();
                
            for(int index = 0; index< numeroFaltantes.size(); index++){
                Integer numeroActual = numeroFaltantes.get(index);
                    if(tLaminas.get(numeroActual) == cLamina){
                        System.out.println(index);
                            nFaltantes.add(numeroActual);
                        }
                    }
            System.out.println(nFaltantes);
            
        ArrayList<Integer> laminasOtraPersona = 
            new ArrayList<Integer>(Arrays.asList(49, 40, 26, 9, 14, 25, 18, 11, 39, 
                    23, 19, 41, 38, 44, 42, 27, 28)); 
        ArrayList<Integer> lPropias = 
            new ArrayList<Integer>(Arrays.asList(5, 13, 35, 48, 43, 0, 7, 30, 27, 2, 
                    1, 40, 14, 28, 8, 10, 36, 49, 39, 23));
           
            ArrayList<Integer>lCambiarFinal1 = new ArrayList<Integer>();
            ArrayList<Integer>lCambiarFinal2 = new ArrayList<Integer>();
                  for(Integer e : laminasOtraPersona){
                      if(!lPropias.contains(e)){
                          lCambiarFinal1.add(e);
                      }
                  }
                  for(Integer lop : lPropias){
                      if(!laminasOtraPersona.contains(lop)){
                          lCambiarFinal2.add(lop);
                      }
                  }
            int sizeF = Math.min(lCambiarFinal1.size(), lCambiarFinal2.size());
            System.out.println(lCambiarFinal1);
            System.out.println(sizeF);
     }  
}
