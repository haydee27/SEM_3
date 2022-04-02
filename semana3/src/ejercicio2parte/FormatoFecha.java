
package ejercicio2parte;

import java.util.Scanner;

public class FormatoFecha {
    
    //Ejercicio resuelto con guia de clase teorica en plataforma
    String fecha;
    
    public FormatoFecha(){
        
        
    }

    public FormatoFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    public String formato1(String fecha){
        String FG = "";
        FG += fecha.substring(0,2) + " - ";
        FG += fecha.substring(2,4) + " - ";
        FG += fecha.substring(4,8) ;
        return FG;
        
    }
     
     public String formato2(String fecha){
         String FG = "";
        FG += fecha.substring(0,2) + " / ";
        FG += fecha.substring(2,4) + " /";
        FG += fecha.substring(4,8) ;
        return FG;
        
    }
     
     public static void main(String [] args){
          Scanner l = new Scanner(System.in);
          FormatoFecha F = new FormatoFecha();
          
          
         System.out.println("Dijite la fecha: ");
         String fecha = l.nextLine();
         F.setFecha(fecha);
         
         
         System.out.println(F.formato1(fecha));
         System.out.println(F.formato2(fecha));
     }
}
