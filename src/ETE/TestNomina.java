/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ETE;

/**
 *
 * @author Pam Vengenz
 */
/*Crear una clase que se llame TestNomina que contenga el metodo main
Crear dos objetos
*/

public class TestNomina {
    public static void main (String args[]){
        try{
        Nomina n1= new Nomina(1,20000);
    System.out.println(n1.getidTrabajador());
    System.out.println(n1.getSaldo());
        
        Nomina n2=new Nomina(2,(float)27496.50);
     System.out.println(n2.getidTrabajador());
     n2.setSaldo(26000);
       System.out.println(n2.getSaldo());
     }catch(SaldoFueraDeRangoException e){
System.out.println(e.getMessage());
}   
    }//main


//catch
}
