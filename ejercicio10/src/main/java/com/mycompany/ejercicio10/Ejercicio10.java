/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;

/**
 *
 * @author Usuario
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        // TODO code application logic here
        int variable1 = 4;
        int variable2 = 81;
        int variable3 = 70;
        int variable4 = 50;
        int variable5 = 2;
        int variable6 = 25;
        int variable7 = 18;
        int variable8 = 12;
        int variable9 = 25;
        int variable10 = 7;
        int variable11 = 40;
        
        System.out.println("-----Solución de problema--------");
        boolean resultado = ((Math.pow(variable1,3) + Math.sqrt(variable2)> variable3) && 
                ((variable4 / variable5)== variable6)) || ((variable7 + variable8 <= variable9) &&
                ! (Math.pow(variable10,2)> variable11));
        
        System.out.println(resultado);
        
    }
}
