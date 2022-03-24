
package desarrollo;

public class Estudiante {
    long carnet;
    String nombre, apellido;
    
    public void registroEstudiante(){
        System.out.println("Metodo para registro de estudiante:");
    }
    
    public void consultarEstudiante(){
        
        System.out.println("Metodo para consulta del estudiante.");
    }
    
    public void eliminarEstudiante(){
        
        System.out.println("Metodo para eliminar de estudiante");
    }
    
    public static void main(String[] args){
        
        Estudiante est = new Estudiante(); // El objeto est es la instancia de la clase Estudiante
        
        est.carnet = 1234; //Asigna valores a cada uno de los atributos est.carnet objeto mas atributo
        est.nombre = "Amelia";
        est.apellido = "Rosales";
        
        est.registroEstudiante();
        est.consultarEstudiante();
        est.eliminarEstudiante();
        
        System.out.println("Carnet : " + est.carnet);// El objeto y el atributo est.carnet
        System.out.println("Nombre: " + est.nombre);
        System.out.println("Apellido:" + est.apellido);
    }
}
