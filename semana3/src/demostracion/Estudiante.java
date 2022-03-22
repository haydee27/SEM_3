
package demostracion;


public class Estudiante  extends Notas{
    //Elementos miembros de una clase
    //atributos, caracteristicas, datos, variables
    //constructores,
    //metodos
    
    int carnet;
    String nombres;
    String apellidos;
    int edad;
    
    public Estudiante(){ 
        
    }

    public Estudiante(int carnet, String nombres, String apellidos, int edad) {
        this.carnet = carnet;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     
    public String info_estudiante(){
        String name;
        name=this.nombres+" "+ this.apellidos;
    return name;
    }
    public  String info_estudiante(String a, String b){
        
        String name ;
        name = a + "  "+ b;
        
        return name;
    }
    
    public String info_estudiante(Estudiante objeto){
        String name= "***********************\n";
        name+= objeto.getNombres() + " " + objeto.getApellidos() + "\n";
        name += "*********************\n";
    
        return name;
    }
    
    public String informacion(){
        String name ="";
        name+="El carnet del estudiante es: " + this.carnet + "\n";
        name+="El nombre del estudiante es: "+ this.nombres + "\n";
        name+="El apellido del estudiante es: " + this.apellidos + "\n";
        name+="La edad del estudiante es: " + this.edad + "\n";
        return name;
        
    }
        
    
}
