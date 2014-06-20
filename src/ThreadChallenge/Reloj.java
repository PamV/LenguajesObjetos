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
public class Reloj implements Runnable {
    public static void main (String args[]){
        Runnable r= new Reloj();
        Thread t1= new Thread (r);
        t1.start();
    }


    public void run() {
        while(true){
        try{
           Calendar c=Calendar.getInstance();
           int hora= c.get(Calendar.HOUR);
           int minuto= c.get(Calendar.MINUTE);
            int segundo= c.get(Calendar.SECOND);
        if(hora==7&&minuto==40&&segundo==0){
System.out.println("Ya terminó la clase");
}
        Thread.sleep(1000);
    }catch(Exception e){}
    }
}

}