/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lob.CursosCapitulo2Tipos;

/**
 *
 * @author PamV
 */
public class Tipos {
   // static int algo;
    public static void main (String args[]){
        //declaramos arreglo de enteros                                                                                                  
       // int [] arreglo1=new int [3];
        int [] arreglo1={-20,7,8,54,8};
       /* System.out.println(arreglo1[0]); //ese 0 es un indice
        System.out.println(algo);
        for (int i=0;i<arreglo1.length;i++){
            System.out.println(arreglo1[i]);
        }
        NO USAR ESTO JAMAS ESPECIALMENTE EN EL EXAMEN!!!!!!!!!!!!!
        */
        //Usar este: (El tipo de arreglo es el tipo de variable a usar)
        for (int x: arreglo1){
            System.out.println(x);
        }
    }
}
