
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
                   System.out.println("\nIngrese el país de la cuenta: ");
                   input.nextLine();
                   String paisDep = input.nextLine();
                   System.out.println("\nIngrese la fecha: ");
                   String fechaDep = input.nextLine();
                   deposito(listCuentas, depMon, depAcc);
                   sumarTransaccion(listTrans, depAcc, fechaDep);
                   listTrans.add(regTransaccion(depAcc, paisDep, "Depósito.", fechaDep, depMon));
                   mostrarTransacciones(listTrans);
                   break;
               case 5:
                   System.out.println("\nIngrese el número de cuenta del cuál desea retirar: ");
                   Long retAcc = input.nextLong();
                   System.out.println("\nIngrese el monto a retirar: ");
                   Float retMon = input.nextFloat();
                   System.out.println("\nIngrese el país de la cuenta: ");
                   input.nextLine();
                   String paisRet = input.nextLine();
                   System.out.println("\nIngrese la fecha: ");
                   String fechaRet = input.nextLine();
                   retiro(listCuentas, retAcc, retMon);
                   sumarTransaccion(listTrans, retAcc, fechaRet);
                   listTrans.add(regTransaccion(retAcc, paisRet, "Retiro.", fechaRet, retMon));
                   mostrarTransacciones(listTrans);
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
                    System.out.println("\nSaldo disponible: $" + array.get(k).getSaldoDispo() + "\n");
                       }}}
         
         public static void retiro(ArrayList<Cuenta> array, Long acc, Float monto){
            for(int k = 0; k < array.size(); k++){
                if(acc.equals(array.get(k).getIdCuenta())){
                    array.get(k).setSaldoDispo(array.get(k).getSaldoDispo()-monto);
                    System.out.println("\n***** RETIRO REALIZADO *****");
                    System.out.println("\nSaldo disponible: $" + array.get(k).getSaldoDispo() + "\n");
                       }}}
         
         public static Transaccion regTransaccion(Long acc, String pais, 
                 String typeTrans, String Fecha, Float monto){
             
             Transaccion auxTrans = new Transaccion();

             auxTrans.setIdCuenta(acc);
             auxTrans.setPais(pais);
             auxTrans.setTypeTrans(typeTrans);
             auxTrans.setFecha(Fecha);
             auxTrans.setMonto(monto);
                     
             return auxTrans;
             }
             
         public static void mostrarTransacciones(ArrayList<Transaccion> array){
             System.out.println("\n***** TRANSACCIONES REGISTRADAS *****\n");
             
             for(int i = 0;i < array.size();i++){
                System.out.println("\nNúmero de cuenta: " + array.get(i).getIdCuenta());
                System.out.println("País: " + array.get(i).getPais());
                System.out.println(array.get(i));      
         }}
         
         public static int sumarTransaccion(ArrayList<Transaccion> array, Long acc, String fecha){
             
             int contadorTrans = 1;
             
             for(int i = 0; i < array.size(); i++){
                    if(acc.equals(array.get(i).getIdCuenta()) && fecha.equals(array.get(i).getFecha())){
                        contadorTrans = contadorTrans + 1;
                            }}
             
         System.out.println("\nTransacciones realizadas con esta cuenta: " + contadorTrans);
         return contadorTrans;
         }
         
             
         
   }


   
    

