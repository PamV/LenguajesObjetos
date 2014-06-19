/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Capitulo4.Threadsitos;

/**
 *
 * @author Pam Vengenz
 */
public class ProbarThreads {
    
    public static void main (String args[]){
        //Paso 1: Crear el thread
        Facil t1=new Facil();
        //Paso 2: Se inicializa, el start esta siendo heredado
        t1.start();
    }
}
