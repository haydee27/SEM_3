
package ejercicio2parte;

import java.util.Scanner;

public class iimprimir {
    public static void main(String [] args){
        
        Scanner l = new Scanner( System.in);
        Empleado E = new Empleado();
        
         
        System.out.println("Escriba el numero de nit: ");
        E.setNnit(l.nextInt());
        System.out.println("Escriba su nombre:  ");
        E.setNombre(l.next());
        System.out.println("Escriba su apellido: ");
        E.setApellido(l.next());
        System.out.println("Escriba su direccion: ");
        E.setDireccion(l.next());
        System.out.println("Escriba su salario: $ ");
        E.setSalario(l.nextDouble());
        System.out.println("Escriba 1 si es un empleado activo o escriba 2 si usted es un empleado inactivo:");
        E.setBandera(l.nextDouble());
        
        
                 
       
        E.informacion();
        E.atributos(E);
        E.Band();
        
        
    }

 
    
     
     
}
