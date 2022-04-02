
package ejercicio1parte;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTablet {

    public static void main(String[] args) {
        double sueldo= 300.0; 
    
        Scanner leer= new Scanner(System.in);
        HashTablet sueldototal =new HashTablet();
        Hashtable <String,String> empleado = new Hashtable <String,String>();
    
        for (int i = 1; i <=5; i++) {
            System.out.println("Ingrese el monto  de la venta del empleado: "+i);
            double venta=leer.nextDouble(); 
            empleado.put("a" +i,String.valueOf(venta));
        }
        
        double comi=0;
        double total=0;
     
        for (int j = 1; j <=5; j++) {
            double datos=0;
             comi= sueldototal.comision(Double.parseDouble(empleado.get("a" +j)));
             total= sueldototal.salario(sueldo, comi);
             System.out.println("el sueldo del empleado "+j+" es: "); 
        }
        
        System.out.println("el sueldo total es: "+total);
        
    }
    
    
    public double comision( double montodeventa) {
        double comision=0;
        if (montodeventa >0  && montodeventa<=999) {
            comision=montodeventa*0.05;
         
        }else if (montodeventa >999  && montodeventa<=2999){
             comision=montodeventa*0.08;
        }else if ( montodeventa>=3000){
             comision=montodeventa*0.1; 
             }
        return comision;
    }
    
    
   public double salario(double sueldo, double comision){
     double salario=0;
     salario=((sueldo+comision)*0.1)+sueldo+comision;
     return salario;
    }
     
                
}
}
