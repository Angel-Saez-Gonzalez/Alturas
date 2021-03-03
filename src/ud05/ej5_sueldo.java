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
public class ej5_sueldo {
    public static void main (String[] args){
        String[] nombre = new String[10];
        float[][] sueldo = new float[10][1];
        Scanner illo = new Scanner (System.in);
        float max=0,min=99999999;
        String nombremax="",nombremin="";
        int menos=0;
        
        for (int i = 0; i < nombre.length; i++) {
            System.out.print("Escribe el nombre del "+(i+1)+"º empleado: ");
            String nom = illo.nextLine();
            nombre[i] = nom;
            System.out.print("Escribe el sueldo del "+(i+1)+"º empleado: ");
            sueldo[i][0] = illo.nextFloat();
            illo.nextLine();   
            if (sueldo[i][0]>max){
                nombremax= nombre[i];
                max= sueldo[i][0];
            }
            if (sueldo[i][0]<min) {
                nombremin = nombre[i];
                min= sueldo[i][0];
            }
            if (sueldo[i][0]<750){
                menos++;
            }
        }
        System.out.println("El que mayor sueldo tiene es: "+nombremax);
        System.out.println("El que menor sueldo tiene es: "+nombremin);
        System.out.println("Hay "+menos+" empleados que cobran menos de 750");
    }
}
