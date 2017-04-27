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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Creación de variables
        double n,m, total=1,i=1;
        Scanner dato=new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        n=dato.nextDouble();
        //Ingreso de datos desde pantalla
        m=n;
        while(i<=n){
            total=total*((m+i)/2);
            m=m-1;
            i++;
        }
        System.out.println("El total es: "+total);
    }
}
