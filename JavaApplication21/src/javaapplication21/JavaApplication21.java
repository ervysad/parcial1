/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int i = 0;
        double resultado = 0;
        double numero = 0;
        System.out.println("INGRESE UN NUMERO");
        numero = lectura.nextDouble();
        if( numero > 0 )
        {
            for ( i=0; i < numero; i++)
            {
                System.out.println(i);
            }
        } else{
            funcion(numero);
            System.out.println(resultado);
        }  
    }
    
    public static double funcion( double numero)
    {

        double proceso = numero * (-1);
        return proceso;
        
    }
}
    

