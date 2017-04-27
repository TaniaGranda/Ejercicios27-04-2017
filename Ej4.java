/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner e = new Scanner(System.in);
        int i=1, horas;
        int n, hora=15, total_horas;
        String nombre;
        double valor;
        System.out.println("Ingrese el numero de empleados");
        n=e.nextInt();
        while(i<=n){
            //procesos
            System.out.println("Ingrese el nombre");
            nombre=e.next();
            System.out.println("Ingrese cuantas horas trabajo");
            horas=e.nextInt();
            valor=(horas*hora)*20;
            System.out.println("Valor sueldo mensual: "+valor);
           //contador
           i++;
        }
    }   
}       
       
           
    
    

