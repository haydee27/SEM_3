
package desarrollo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RegistroEstudiante {
    public static void main(String [] args){
        estudiante1 est= new estudiante1(); //Objeto de la clase estudiante
        //agregar la clase respectiva para la lectura desde teclado
        BufferedReader leer = new BufferedReader( new InputStreamReader(System.in));
        
        try{
            //Ingreso de los datos respectivos
            System.out.println("Carnet del estudiante");
            long carnet = Long.parseLong(leer.readLine());
            System.out.println("Nombres del estudiante");
            String nombres = leer.readLine();
            System.out.println("Apellidos del estudiante: ");
            String apellidos = leer.readLine();
            
            //asiganando valores a cada atributo
            est.setCarnetEstudiante(carnet);
            est.setNombresEstudiante(nombres);
            est.setApellidosEstudiante(apellidos);
            
            //RECUPERACION DE DATOS
            
            System.out.println("<<<Recuperacion valores>>>");
            System.out.println("Carnet: " + est.getCarnetEstudiante());
            System.out.println("Nombres: " + est.getNombresEstudiante());
            System.out.println("Apellidos: " + est.getApellidosEstudiante());
        }catch(Exception e){
            System.out.println("e.getMessage");
        }
        
    }
}
