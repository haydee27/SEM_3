
package demostracion;

import java.util.Scanner;


public class Rdemuestracion {
    public static void main (String [] args){
        Scanner leer = new Scanner (System.in);
        
        String Nombre ;
        Estudiante objeto = new Estudiante();
        
        System.out.println("Digite el carnet: ");
        objeto.setCarnet(Integer.parseInt(leer.nextLine()));
        
        System.out.println("Digite los nombre del estudiante: ");
        objeto.setNombres(leer.nextLine());
        
        System.out.println("Dijite los apellidos del estudiante: ");
        objeto.setApellidos(leer.nextLine());
        
        System.out.println("Digite la edad del estudiante: ");
        objeto.setEdad(leer.nextInt());
        
        System.out.println("Digite la nota 1 : ");
        objeto.setNota1(leer.nextDouble());
        
        System.out.println("Digite la nota 2 : ");
        objeto.setNota2(leer.nextDouble());
        
        System.out.println("Digite la nota 3 : ");
        objeto.setNota3(leer.nextDouble());
        
        System.out.println("Digite la nota 4 : ");
        objeto.setNota4(leer.nextDouble());
        
       // System.out.println("El nombre del estudiante es: " + objeto.info_estudiante());
       //Nombre = objeto.info_estudiante(objeto.getNombres(), objeto.getApellidos());
       // System.out.println("Nombre es: ") + Nombre;
       // Nombre = objeto.info_estudiante(objeto);
       
       Nombre = objeto.informacion();
        System.out.println("" + Nombre);
        System.out.println("La nota final es: " + objeto.Promedio());
        System.out.println("La observacion es: " + objeto.observacion(objeto));
        
                
    }
}
