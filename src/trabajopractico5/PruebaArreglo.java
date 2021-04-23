/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico5;

import java.util.Scanner;
import metodos.Arreglo;

/**
 *
 * @author Emiliano
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     /* Luego desde el método main de una clase de nombre PruebaArreglo, invocar los métodos 
de la clase Arreglo creada por usted.*/
     int []enteros = {1,2,3,4,5,6,7,8,9,10};
     int [][]enteros2 = {{0,1,2},{1,1,2,3},{2,1,2,3,4}};
     String v="vocales";
     String v1="vocalesss";
     char caracter='a';
     Arreglo.sumarLista(enteros);
        System.out.println("El numero mayor del arreglo es: "+Arreglo.buscarMayor(enteros2));
        System.out.println("La palabra: "+v+" Tiene un total de: "+Arreglo.cuentaVocales(v)+" vocales.");
        System.out.println("La palabra: "+v1+" tiene un total de: "+Arreglo.cuentaCaracter(v1,caracter)+" caracteres("+caracter+")");
    
   
    
    }
    
}
