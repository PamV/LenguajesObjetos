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

//1.- Crear una clase con sus getters y setters (Nomina: float saldo;    int idTrabajador;)
public class Nomina {
    float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo)throws SaldoFueraDeRangoException{
   if (saldo<20000&&saldo>25000) throw new SaldoFueraDeRangoException();  
   else this.saldo = saldo;
    }
    
    int idTrabajador;
    public int getidTrabajador(){
        return idTrabajador;
    }
    
    public void setidTrabajador(int idTrabajador){
        this.idTrabajador=idTrabajador;
        
    }
    //2.- Agrear dos constructores, uno sin argumentos y otro que inicialize sus atributos
    public Nomina(){
        
    }
    
    public Nomina(int idTrabajador, float saldo){
        this.idTrabajador=idTrabajador;
        this.saldo=saldo;
    }






}




