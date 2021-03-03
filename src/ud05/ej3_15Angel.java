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
public class ej3_15Angel {
    public static void main (String[] args){
        String eleg;
        int valor, posicion;
        Scanner illo = new Scanner (System.in);
        int[] arrayAy = new int[10];
        do{
            System.out.println("Elige entre estas opciones:");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            eleg = illo.nextLine();
            switch(eleg){
                case "a":
                    for (int i = 0; i<arrayAy.length;i++){
                        System.out.print(arrayAy[i]+" ");
                    }
                    System.out.println("");
                    break;
                case "b":
                    System.out.print("Introduce el valor a introducir: ");
                    valor= illo.nextInt();
                    System.out.print("Introduce la posicion a cambiiar: ");
                    posicion = illo.nextInt();
                    if (posicion > arrayAy.length){
                        System.out.println("Introduce una posicion entre 1 y 10");
                    }else{
                        arrayAy[posicion] = valor;
                    }
                    break;
                case "c":
                    break;
                default:
                    System.out.println("Introduce una de las opciones");
                    break;
            }
        }while(!eleg.equalsIgnoreCase("c"));
    }
}
