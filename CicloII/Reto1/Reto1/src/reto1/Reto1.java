/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;
import java.util.Scanner;

/**
 *
 * @author FS
 * Progamming cicle II -- Java -- Universidad Nacional
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int edadHarry, edadLuisa;
        Scanner sc = new Scanner(System.in); 
        int edadPaula = sc.nextInt();
        String estatus = "";
        edadHarry = 2 * edadPaula + 4;
        edadLuisa = (edadHarry + edadPaula)/5;
        
        if(edadLuisa<=20){
           estatus = "uno";
        }
        else if(edadLuisa>20 && edadLuisa<=30){
            estatus = "dos";
        }
        else if(edadLuisa>30 && edadLuisa<=5060){
            estatus = "tres";
        }
        else{
            estatus = "cuatro";
        }
                
        System.out.println(edadPaula+ " " +edadHarry+ " " +edadLuisa);
        System.out.println(estatus);
        
    }
    
}
