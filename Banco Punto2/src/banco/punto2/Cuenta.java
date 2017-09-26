/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.punto2;

import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Cuenta {
     double NumeroDeCuenta;
     int SaldoDeCuenta;
     String FechaDeCreacionCuenta;
     String NombreCliente;
     
     
              public int Consignar() {
       
                  System.out.println("Cual es el valor a consignar? ");   
                   Scanner capt = new Scanner(System.in);
                   int a = capt.nextInt();

         SaldoDeCuenta = SaldoDeCuenta + a;
         return SaldoDeCuenta;
       
     }
          
               public int Retirar() {
               System.out.println("Cual es el valor a Retirar? ");   
                   Scanner capt1 = new Scanner(System.in);
                   int b = capt1.nextInt();

         SaldoDeCuenta = SaldoDeCuenta - b;
                   return SaldoDeCuenta;
               }
               
                public void getSaldo(){
                    System.out.println("El nuevo Saldo Es: ");
                    System.out.println(SaldoDeCuenta);
                }
               
}