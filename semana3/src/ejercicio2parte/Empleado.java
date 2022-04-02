
package ejercicio2parte;

public class Empleado {
    int nnit;
    String apellido;
    String nombre;
    String direccion;
    double SDevengado;
    double SConDescuento;
    double salario;
    double bandera;
    
    public Empleado(){
        
    }

    public Empleado(double bandera, double salario, int nnit, String apellido, String nombre, String direccion, double SDevengado, double SConDescuento) {
        this.nnit = nnit;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.SDevengado = SDevengado;
        this.SConDescuento = SConDescuento;
        this.salario = salario;
        this.bandera = bandera;
    }

    public double getBandera() {
        return bandera;
    }

    public void setBandera(double bandera) {
        this.bandera = bandera;
    }
    

    public int getNnit() {
        return nnit;
    }

    public void setNnit(int nnit) {
        this.nnit = nnit;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSDevengado() {
        return SDevengado;
    }

    public void setSDevengado(double SDevengado) {
        this.SDevengado = SDevengado;
    }

    public double getSConDescuento() {
        return SConDescuento;
    }

    public void setSConDescuento(double SConDescuento) {
        this.SConDescuento = SConDescuento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double SD(){
       this.SDevengado = this.salario;
     
        return this.SDevengado;
    }
        
     public void Band(){
         
       
        
        
        if(this.bandera == 1){
            
            System.out.println("Usted es un empleado activo");
        }else if(this.bandera == 2){
            System.out.println("Usted es un empleado inactivo");
        }
        
                 
     }
     
     public void informacion(){
         
         System.out.println("Su nombre es: "+ this.nombre +" " + this.apellido + "\n");
         System.out.println("Su direccion es: " + this.direccion + "\n");
     }
     
     public  void atributos(Empleado dato){
         
         
         System.out.println("Informacion de empleado ");
         System.out.println("Su numero de nit es: " + this.nnit);
         System.out.println("Su salario devengado: $ "+ this.salario);
         System.out.println("El salaio menos descuento de renta: " + dato.Renta());
      
     }
     
       public double Renta(){
        
       double R= this.salario * 0.10;
       double t = this.salario - R;
        return t;
    }
     
}
