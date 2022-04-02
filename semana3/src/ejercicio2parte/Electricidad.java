
package ejercicio2parte;

import java.util.Scanner;


public class Electricidad {
    public static void main (String [] args){
        
        Scanner l = new Scanner (System.in);
        Factura_Electricaa F = new Factura_Electricaa();
        
        System.out.println("Escriba el numero de cuenta");
        F.NC = l.nextInt();
        System.out.println("Escriba la lectura actual del medidor: ");
        F.LAM = l.nextInt();
        System.out.println("Escriba la lectura anterios del medidor: ");
        F.LAnteM = l.nextInt();
        System.out.println("");
       
        F.atributos(F);
        
    }
}
