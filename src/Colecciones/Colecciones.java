/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Colecciones;

import java.util.ArrayList;

/**
 *
 * @author Pam Vengenz
 */
public class Colecciones {
    
    public static void main (String args[]){
        Usuario u1=new Usuario();
        u1.setId(1);
        u1.setEmail("pamv@gmail.com");
        u1.setNombre("Pam");
        u1.setPaterno("Vengenz");
        u1.setSueldo(50000);
        Usuario u2= new Usuario(2,"richiev@gmail.com", "Richie", "Vengenz", 60000);
        Usuario u3= new Usuario(3,"muffinv@gmail.com", "Muffin", "Vengenz", 10000);
        
        //Creamos un ArrayList de tipo Usuario
        ArrayList<Usuario> usuarios= new ArrayList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        
        for(Usuario u: usuarios){
        System.out.println(u);
    }
        
       // System.out.println("Ya se guardo el objeto: "+u1);
    }
    
}
