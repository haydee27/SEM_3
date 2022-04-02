
package ejercicio1parte;

import java.util.Scanner;

public class CalculoIva {
    
    double precio;
    double iva = 0.13;
    
    public double PI( double precio, double iva){
        precio = this.precio;
        iva = this.iva;
        double PCI = 0.0;
        double precioiva;
        
        PCI = precio * iva;
        precioiva = precio + PCI;
        
        
     return precioiva;   
    }
     
    public double PSI(CalculoIva dato, double iva){
        iva = this.iva;
        
        double i = this.precio * iva; 
        double psi = dato.PI(precio, iva) - i;
        return psi;
    }
    
    public static void main(String [] args){
        CalculoIva cal = new CalculoIva();
        Scanner L = new Scanner(System.in);
        
        
        System.out.println("Escriba el precio del articulo: $");
        cal.precio = L.nextDouble();
        
        System.out.println("El precio de su producto mas iva es: " + cal.PI(0, 0));
        System.out.println("El precio de su producto sin iva es: " + cal.PSI(cal, 0) );
        
       
    }
    
    
}
