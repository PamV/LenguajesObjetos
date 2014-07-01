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
public class SaldoFueraDeRangoException extends Exception{
    public SaldoFueraDeRangoException(){
        super("Saldo fuera de rango");
    }
}
