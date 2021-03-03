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
public class ej5_13 {
    public static void main(String[]args){
        int eu, debajo=0,encima=0;
        float alt, min=9999999, max=0, media, suma=0;
        Scanner illo = new Scanner (System.in);
        System.out.print("Dime cuantas alturas vas a almacenar: ");
        eu = illo.nextInt();
        float[] arrayAy = new float[eu];
        
        for (int i=0;i<arrayAy.length;i++){
            System.out.print("Dime la altura: ");
            alt=illo.nextFloat();
            arrayAy[i]=alt;
            if (arrayAy[i]>max){
                max=arrayAy[i];
            }
            if (arrayAy[i]<min){
                min=arrayAy[i];
            }
            suma=arrayAy[i]+suma;
        }
        media= suma / arrayAy.length;
        for (int i=0;i<arrayAy.length;i++){
            if (arrayAy[i]>media){
                encima++;
            }else{
                debajo++;
            }
        }
        System.out.println("La media de altura es: "+media);
        System.out.println("La altura maxima es: "+max);
        System.out.println("La altura mas baja es: "+min);
        System.out.println("Hay "+encima+" por encima de la media");
        System.out.println("Hay "+debajo+" por debajo de la media");
    }
}
