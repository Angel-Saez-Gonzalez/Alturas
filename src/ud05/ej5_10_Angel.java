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
public class ej5_10_Angel {
    public static void main (String[] args){
        int num1, num2;
        Scanner illo = new Scanner (System.in);
        System.out.println("Escribe el primer numero:");
        num1=illo.nextInt();
        System.out.println("Escribe el segundo numero:");
        num2=illo.nextInt();
        
        if (num1<num2){
            int[] arrayAy=new int[num2-num1];
            for(int i=0;i<arrayAy.length;i++){
                arrayAy[i]=num1+i;
                }
            for(int i=0;i<arrayAy.length;i++){
                    System.out.print(arrayAy[i]+" ");
            }
            System.out.println(num2);
        }else{
            System.out.println("El primer numero debe ser menor");
        }
    }
}
