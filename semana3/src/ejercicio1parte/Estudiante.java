
package ejercicio1parte;

import java.util.Hashtable;
import java.util.Scanner;

public class Estudiante {
        
    public static void main (String[] args){
        Scanner L = new Scanner(System.in);
       
        Hashtable<String, String> est = new Hashtable<String,String>();
        
        for( int i = 1; i <=5; i++){
            System.out.println("Ingrese el numero de carnet de estudiante: " + i);
              int id = L.nextInt();
              est.put("a"+i, String.valueOf(id));
            
            System.out.println("El codigos de carnet es : " + id);    
        }
        
        for(int n = 1; n<=5; n++){
            
            System.out.println("Ingrese el nombre completo: " + n);
            String no= L.next();
            est.put("a"+ no, String.valueOf(no));
            
            
            
           System.out.println("El nombres es: " + no); 
        }
        
        for(int c = 1; c<= 5; c++){
            
            System.out.println("Ingrese el codigo d la carrera: " + c);
            int codi = L.nextInt();
            est.put("a" + c, String.valueOf(codi));
            System.out.println("El codigos de carreras es: " + codi);
        }
       
        
       
    }
    
}
