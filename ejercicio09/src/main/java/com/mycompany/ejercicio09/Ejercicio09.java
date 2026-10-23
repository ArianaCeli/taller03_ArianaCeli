/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio09;

/**
 *
 * @author Usuario
 */
public class Ejercicio09 {

    public static void main(String[] args) {
         // TODO code application logic here
        int variable1 = 225;
        int variable2 = 5;
        int variable3 = 50;
        int variable4 = 120;
        int variable5 = 4;
        int variable6 = 30;
        
        System.out.println("-----solución a problema-----------");
        boolean resultado = ! (Math.sqrt(variable1) + Math.pow(variable2,2)< variable3)
                && ((variable4 / variable5)== variable6);
        
        System.out.println(resultado);
        
    }
}
