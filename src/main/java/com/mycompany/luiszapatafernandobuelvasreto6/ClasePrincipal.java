
package com.mycompany.luiszapatafernandobuelvasreto6;
import java.util.Scanner;

public class ClasePrincipal {
        
   public static void main(String[] args){
       
    Scanner input = new Scanner(System.in);
   
   while(true){
       
       System.out.println("\n********** BIENVENIDO **********\n");
       System.out.println("\nSeleccione una opción: \n");
       System.out.println("1. Agregar cuenta de ahorros.");
       System.out.println("2. Eliminar cuenta de ahorros.");
       System.out.println("3. Consultar saldo.");
       System.out.println("4. Realizar depósitos.");
       System.out.println("5. Realizar retiros.");
       
       var x = input.nextInt();
        
       
           switch (x) {
               case 1:
                   System.out.println("1.");
                   break;
               case 2:
                   System.out.println("2.");
                   break;
               case 3:
                   System.out.println("3.");
                   break;
               case 4:
                   System.out.println("4.");
                   break;
               case 5:
                   System.out.println("5.");
               default:
                   System.out.println("Por favor seleccione una opción válida.\n");
                   break;
                   }
                }       
   }
   
   
   
   
   
   }
    

