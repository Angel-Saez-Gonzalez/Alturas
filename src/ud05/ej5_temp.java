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
public class ej5_temp {
    public static void main (String[] args){
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        Scanner illo = new Scanner(System.in);
        int[][] guardar = new int[12][];
        int temp=0, cont=0,suma=0;
        
        for (int i = 0; i < meses.length; i++) {
            System.out.print("Dima cuantas mediciones has hecho en "+meses[i]+": ");
            int num = illo.nextInt();
            guardar[i] = new int[num]; 
            for (int j = 0; j < num; j++) {
                System.out.print("Escribe la temperatura del mes "+meses[i]+": ");
                temp = illo.nextInt();
                guardar[i][j] = temp;
                cont++;
                suma = suma + guardar[i][j];
            }
        }
        for (int i = 0; i < meses.length; i++) {
            System.out.print("El mes "+meses[i]+ " ");
            for (int j = 0; j < guardar[i].length; j++) {
                System.out.print(guardar[i][j]+" ");
            }
            System.out.println();
        }
        int media = suma / cont;
        System.out.println("La media ha sido de: "+media);
    }
}
