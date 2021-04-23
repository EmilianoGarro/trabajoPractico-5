/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Emiliano
 */
public class Arreglo {
    
   /* En un nuevo proyecto, crear una clase de nombre Arreglo con los siguientes métodos 
estáticos (static):
a) Método sumarLista que reciba por parámetro un arreglo unidimensional de 
enteros y muestre por pantalla la suma y promedio de los mismos.
*/ 
    public static void sumarLista(int[]enteros){
    int suma=0;
    float promedio;
        for(int i=0;i<enteros.length;i++){
           suma+=enteros[i];
           }
        promedio=suma;
        promedio/=enteros.length;
        System.out.println("La suma de todos los numeros del arreglo es: "+suma+" y el promedio es: "+promedio);
    }
    /*public static void sumarLista(int[]enteros){
    int i=0,suma=0;
    float promedio;
        while(i<enteros.length){
        suma+=enteros[i];
        i++;
        }
        promedio=suma;
        promedio/=enteros.length;
        System.out.println("La suma de todos los numeros del arreglo es: "+suma+" y el promedio es: "+promedio);
    }*/
    
    /*public static void sumarLista(int[]enteros){
    int i=0,suma=0;
    float promedio;
    do{
    suma+=enteros[i];
    i++;
    }while(i<enteros.length);
    promedio=suma;
    promedio/=enteros.length;
    System.out.println("La suma de todos los numeros del arreglo es: "+suma+" y el promedio es: "+promedio);
    }*/
    
    
  /*  b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e 
irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
*/
    public static int buscarMayor(int[][]enteros){
    int mayor = 0;
        for (int[] entero : enteros) {
            for (int y = 0; y < entero.length; y++) {
                if (mayor < entero[y]) {
                    mayor = entero[y];
                }
            }
        }
        return mayor;
    }
    
    /*c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad 
de vocales que tiene la cadena.*/
    public static int cuentaVocales(String palabra){
        palabra = palabra.toLowerCase();
        int contador=0;
       
        for(int i=0;i<palabra.length();i++){
        switch(palabra.charAt(i)){
            case 'a':contador++;break;
            case 'e':contador++;break;
            case 'i':contador++;break;
            case 'o':contador++;break;
            case 'u':contador++;break;
            default: break;
        }
        }
    return contador;    
        
    }
    
/*d) Método cuentaCaracter que reciba por parámetro un String y un caracter, luego 
retorne la cantidad de veces que se repite en la cadena el carácter recibido.
*/
public static int cuentaCaracter(String palabra,char caracter){
    palabra=palabra.toLowerCase();
    int contador=0;
    for(int i=0;i<palabra.length();i++){
    if(palabra.charAt(i)==caracter){
    contador++;
    }
    }
    return contador;
}



}
