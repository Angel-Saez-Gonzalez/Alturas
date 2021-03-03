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
public class ud5_18Angel {
    public static void main (String[] args){
        int num1,num2,cont1=0,cont2=0;
        Scanner illo = new Scanner (System.in);
        int[] arrayAy1 = new int[10];
        int[] arrayAy2 = new int[10];
        int[] arrayAyjunto = new int[20];
        
        System.out.println("Introducel los primeros 10 numeros del primer array:");
        for (int i = 0; i < arrayAy1.length; i++){
            System.out.print("Introduce el valor: ");
            num1=illo.nextInt();
            arrayAy1[i]=num1;
        }
        
        System.out.println("Introducel los primeros 10 numeros del segundo array:");
        for (int i = 0; i < arrayAy2.length; i++){
            System.out.print("Introduce el valor: ");
            num2=illo.nextInt();
            arrayAy2[i]=num2;
        }
        
        for (int i =0;i < arrayAyjunto.length;i++){
            if (i%2==0){
                arrayAyjunto[i]=arrayAy1[cont1];
                cont1++;
            }else if(i%2==1){
                arrayAyjunto[i]=arrayAy2[cont2];
                cont2++;            
            }
        }
        
        for (int i = 0; i < arrayAyjunto.length;i++){
            System.out.print(arrayAyjunto[i]+" ");
        }
    }
}
