
package com.mycompany.luiszapatafernandobuelvasreto6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class Main {

   public static void main(String[] args){
       
    Scanner input = new Scanner(System.in);
    ArrayList <Cuenta> listCuentas = new ArrayList<>();
    ArrayList <Transaccion> listTrans = new ArrayList<>();
    
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
                   listCuentas.add(leerCuenta());
                   mostrarCuentas(listCuentas);
                   break;
               case 2:
                   System.out.println("\nIngrese el número de cuenta a eliminar: ");
                   Long deleteAcc = input.nextLong();
                   eliminarCuenta(listCuentas, deleteAcc);
                   mostrarCuentas(listCuentas);
                   break;
               case 3:
                   System.out.println("\nIngrese el número de cuenta a consultar: ");
                   Long saldAcc = input.nextLong();
                   mostrarSaldo(listCuentas, saldAcc);                
                   break;
               case 4:
                   System.out.println("\nIngrese el número de cuenta al cuál desea depositar: ");
                   Long depAcc = input.nextLong();
                   System.out.println("\nIngrese el monto a depositar: ");
                   Float depMon = input.nextFloat();
                   deposito(listCuentas, depMon, depAcc);
                   break;
               case 5:
                   System.out.println("\nIngrese el número de cuenta del cuál desea retirar: ");
                   Long retAcc = input.nextLong();
                   System.out.println("\nIngrese el monto a retirar: ");
                   Float retMon = input.nextFloat();
                   retiro(listCuentas, retAcc, retMon);
                   break;
               default:
                   System.out.println("Por favor seleccione una opción válida.\n");
                   break;
                   }
                }  
   }     
   
        public static void mostrarSaldo(ArrayList<Cuenta> array, Long acc){
            for (int j = 0; j < array.size(); j++) {
                if (acc.equals(array.get(j).getIdCuenta())) {
                    System.out.println("\nEl saldo de la cuenta es: $"
                    + array.get(j).getSaldoDispo());
                }}}
   
        public static void mostrarCuentas(ArrayList<Cuenta> array){
            System.out.println("\n***** CUENTAS REGISTRADAS *****");
             for(int i = 0;i < array.size();i++){
                System.out.println(array.get(i));      
         }}

        public static Cuenta leerCuenta(){
            Scanner input = new Scanner(System.in);
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
            return aux;
         }

         public static void eliminarCuenta(ArrayList<Cuenta> array, Long acc){
                for(int i = 0; i < array.size(); i++){
                    if(acc.equals(array.get(i).getIdCuenta())){
                        array.remove(i);
                        System.out.println("\n***** CUENTA ELIMINADA *****");
                            }}}
         
         public static void deposito(ArrayList<Cuenta> array, Float monto, Long acc){
             for(int k = 0; k < array.size(); k++){
                if(acc.equals(array.get(k).getIdCuenta())){
                    array.get(k).setSaldoDispo(array.get(k).getSaldoDispo()+monto);
                    System.out.println("\n***** DEPÓSITO REALIZADO *****");
                    System.out.println("Saldo disponible: " + array.get(k).getSaldoDispo() + "\n");
                       }}}
         
         public static void retiro(ArrayList<Cuenta> array, Long acc, Float monto){
            for(int k = 0; k < array.size(); k++){
                if(acc.equals(array.get(k).getIdCuenta())){
                    array.get(k).setSaldoDispo(array.get(k).getSaldoDispo()-monto);
                    System.out.println("\n***** RETIRO REALIZADO *****");
                    System.out.println("Saldo disponible: $" + array.get(k).getSaldoDispo() + "\n");
                       }}}
   }


   
    

