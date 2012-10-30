/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newscor;

import java.util.Scanner;

/**
 *
 * @author Escorpion
 */
public class Newscor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0;
       Scanner lectura = new Scanner(System.in);
       
       opcion=lectura.nextInt();
       
      
      
       switch (opcion) {
           
         
               case 1:
                System.out.println(" AYUDA ");
                System.out.print(" *Seleccione el numero de la tarea que desea hacer.\n\n*Luego le aparecera la opcion que ejecuto ");
                
                
               
              
                
                break;
               
           case 2:
               String escorpion=lectura.next();
               for(int i=escorpion.length()-1;i>=0;i--){
                   
               char c=escorpion.charAt(i);
               System.out.print(c);
              
               
               }
               break;
                
           case 3:
              String Cadena = "culo";
              System.out.println("Cadena de Texto: '" + Cadena + "'");
              System.out.println("Tamaño de la cadena: " +   Cadena.length() + " caracteres");
               
       }
    }
}
