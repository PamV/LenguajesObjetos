/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pam Vengenz
 */
import java.util.*;
public class Relojito {
    public static void main (String t[]){
        Thread t1=new Thread(new Runnable(){
            public void run(){
                //El código a ejecutar va aquí
                while(true){
        try{
           Calendar c=Calendar.getInstance();
           int hora= c.get(Calendar.HOUR);
           int minuto= c.get(Calendar.MINUTE);
            int segundo= c.get(Calendar.SECOND);
        if(hora==7&&minuto==38&&segundo==0){
System.out.println("Ya terminó la clase");
}//cierra if
        Thread.sleep(1000);
    }catch(Exception e){}//ciera try catch
    }//cierra true
                
                
                
            }//cierra run
        }//lave runnable
        );//cierra parentesis runnable
        t1.start();
    }//cierra main
    
}//cierra relojito
