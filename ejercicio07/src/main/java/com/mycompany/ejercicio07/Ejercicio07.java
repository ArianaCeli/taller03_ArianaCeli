/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio07;

/**
 *
 * @author Usuario
 */
public class Ejercicio07 {

    public static void main(String[] args) {
         // TODO code application logic here
        int variable1 = 15;
        int variable2 = 25;
        int variable3 = 30;
        int variable4 = 8;
        int variable5 = 60;
        int variable6 = 144;
        int variable7 = 12;
        
        System.out.println("-----------solución a problema------------");
        boolean resultado = ((variable1 + variable2)> variable3) || (Math.pow(variable4,2)< variable5) && 
                (Math.sqrt(variable6) == variable7);
        
        System.out.println(resultado);
        
    }
}
