
package com.mycompany.luiszapatafernandobuelvasreto6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class Main {
    
        
   public static void main(String[] args){
       
    Scanner input = new Scanner(System.in);
    ArrayList <Cuenta> listCuentas = new ArrayList<>();
   
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

                    Cuenta aux = new Cuenta();

                    System.out.println("\nIngrese los datos de la cuenta que desea agregar: \n");
                    System.out.println("Número de la cuenta: ");
                    aux.setIdCuenta(input.nextLong());
                    input.nextLine();
                    System.out.println("País: ");
                    aux.setPais(input.nextLine());
                    System.out.println("Tipo de documento del titular: ");
                    aux.setTypeDoc(input.nextLine());
                    System.out.println("Número de documento del titular: ");
                    aux.setNumDoc(input.nextLong());
                    input.nextLine();
                    System.out.println("Nombre completo del titular: ");
                    aux.setNomTitu(input.nextLine());
                    System.out.println("Saldo disponible: ");
                    aux.setSaldoDispo(input.nextFloat());
                    System.out.println("Monto máximo por transacción: ");
                    aux.setMaxTrans(input.nextInt());
                    System.out.println("Operaciones permitidas por día: ");
                    aux.setDayTrans(input.nextInt());
                    listCuentas.add(aux);

                    System.out.println("\n***** CUENTAS REGISTRADAS *****");

                    for(int i = 0; i < listCuentas.size(); i++){
                        System.out.println(listCuentas.get(i));
                     }

                    /*Iterator j = listCuentas.iterator();
                    System.out.println("\nPRUEBA");
                    while(j.hasNext()){
                        System.out.println(j.next());

                    }*/

                   break;
               case 2:
                   
                   System.out.println("\nIngrese el número de cuenta a eliminar: ");
                   Long deleteAcc = input.nextLong();
                       
                   for(int i = 0; i < listCuentas.size(); i++){
                       if(deleteAcc.equals(listCuentas.get(i).getIdCuenta())){
                           listCuentas.remove(i);
                           System.out.println("\n***** CUENTA ELIMINADA *****");
                       }
                   }
                   
                   System.out.println("\n***** CUENTAS REGISTRADAS *****");

                    for(int i = 0; i < listCuentas.size(); i++){
                        System.out.println(listCuentas.get(i));
                     }
                   
                   break;

               case 3:
                   
                   System.out.println("\nIngrese el número de cuenta a consultar: ");
                   Long saldAcc = input.nextLong();
                   
                   for(int j = 0; j < listCuentas.size(); j++){
                       if(saldAcc.equals(listCuentas.get(j).getIdCuenta())){
                           System.out.println("\nEl saldo de la cuenta es: $"
                           + listCuentas.get(j).getSaldoDispo());
                       }
                   
                   }
                   
                   
                   break;
               case 4:
                   
                   System.out.println("\nIngrese el número de cuenta al cuál desea depositar: ");
                   Long depAcc = input.nextLong();
                   System.out.println("\nIngrese el monto a depositar: ");
                   Float depMon = input.nextFloat();
                   
                   
                   for(int k = 0; k < listCuentas.size(); k++){
                       if(depAcc.equals(listCuentas.get(k).getIdCuenta())){
                           listCuentas.get(k).setSaldoDispo(listCuentas.get(k).getSaldoDispo()+depMon);
                           System.out.println("\n***** DEPÓSITO REALIZADO *****");
                           System.out.println("Saldo disponible: " + listCuentas.get(k).getSaldoDispo() + "\n");
                       }
                   
                   }
                   
                   
                   break;
               case 5:
                   
                   System.out.println("\nIngrese el número de cuenta del cuál desea retirar: ");
                   Long retAcc = input.nextLong();
                   System.out.println("\nIngrese el monto a retirar: ");
                   Float retMon = input.nextFloat();
                   
                   
                   for(int k = 0; k < listCuentas.size(); k++){
                       if(retAcc.equals(listCuentas.get(k).getIdCuenta())){
                           listCuentas.get(k).setSaldoDispo(listCuentas.get(k).getSaldoDispo()-retMon);
                           System.out.println("\n***** RETIRO REALIZADO *****");
                           System.out.println("Saldo disponible: " + listCuentas.get(k).getSaldoDispo() + "\n");
                       }
                   
                   }
                   
                   break;
               default:
                   System.out.println("Por favor seleccione una opción válida.\n");
                   break;
                   }
                }       
   }


   }
    

