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
public class Intermedia implements Runnable{
    
    
    public static void main (String args[]){
        //Paso 1 crear el thread
        Runnable r= new Intermedia();
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3= new Thread(r);
        //Paso2 inicializarlo
        t1.setName("Impresion");
        t2.setName("Conexion");
        t3.setName("Guardar");
        t1.start();
        t2.start();//a dormir!!!
        t3.start();
       
    }

    @Override
    public void run() {
        //ejecutarse
        try{
            //if(Thread.currentThread().getName().equals("Conexion"))Thread.sleep(8000);
            if(Thread.currentThread().getName().equals("Impresion"))Thread.sleep(2000);
            if(Thread.currentThread().getName().equals("Conexion"))Thread.sleep(4000);
            if(Thread.currentThread().getName().equals("Guardar"))Thread.sleep(6000);
        System.out.println(Thread.currentThread().getName());
        //System.out.println("Soy un thread mediano");
    }catch(Exception e){}
    }
}

//tarea: hacer que cada thread de los 3 que ya estan se imprima cada dos segundos