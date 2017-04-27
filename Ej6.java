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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creación de variables
        int n,m,total=1,fac=1,i=1;
        Scanner dato=new Scanner(System.in);
        
        //Ingreso de datos desde pantalla
        
        System.out.print("Ingrese un número: ");
        n=dato.nextInt();
        
        //Proceso
        m=n;
        while(i<=n){
            
            if(m%2==0){
                total=total*(i+m);
                
            }else{
                if(m%2!=0){
                    while(i<=m){
                      fac=fac*i;
                      i++;
                    }
                    total=total*(i+fac);
                }
            
            }
            i++;
            m=m-1;
        }
        System.out.println("El total es: "+total);
       
    }
    
}
