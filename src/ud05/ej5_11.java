/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud05;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class ej5_11 {
    public static void main (String[]args){
        double r;
        int cint=0;
        double[] arrayAy = new double[100];
        Scanner illo = new Scanner (System.in);
        System.out.print("Dime un numero enre 0.0 y 1.0: ");
        r=illo.nextDouble();
        
        for (int i = 0; i<arrayAy.length;i++){
            arrayAy[i]= Math.random();
            if (arrayAy[i]>=r){
                cint++;
            }
        }
        System.out.println("Hay "+cint+" numeros por encima de "+r);
    }
}
