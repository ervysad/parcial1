/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.punto2;
import java.io.*;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class BancoPunto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Banco B1 = new Banco();
         B1.CodigoB = 025714;
         B1.NombreB = "Banco Americas";
         
         Cuenta C1 = new Cuenta();
         C1.NumeroDeCuenta = 22045861;
         C1.FechaDeCreacionCuenta = "08/07/2006";
         C1.NombreCliente = "Clara";
         C1.SaldoDeCuenta = 500;
         
         Cuenta C2 = new Cuenta ();
         C2.NumeroDeCuenta = 21405861;
         C2.FechaDeCreacionCuenta = "06/02/1998";
         C2.NombreCliente = "pablo";
         C2.SaldoDeCuenta = 12000;
         
         System.out.println(C1.SaldoDeCuenta);
         System.out.println(C2.SaldoDeCuenta);
         C1.Consignar();
         C1.getSaldo();
         C1.Retirar();
         C1.getSaldo();
         C2.Consignar();
         C2.getSaldo();
         C2.Retirar();
         C2.getSaldo();
         
         
    }
    
}
