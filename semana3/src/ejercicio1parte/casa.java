
package ejercicio1parte;


public class casa {
    
    String ncasa ;
    int pasaje ;
    String calle;
    
    public void imprimir (){
        
        System.out.println("El numero de casa es: " + this.ncasa);
        System.out.println("En numero del pasaje es: " + this.pasaje);
         System.out.println("En nombre de la calle es:" + this.calle);
       
        
    }
    
    public static void main(String [] args){
        casa C = new casa();
        
        C.calle= "Rio Arriba";
        C.ncasa = "TH205";
        C.pasaje =29;
        
        System.out.println("Los datos de su casa son: ");
        C.imprimir();
        
        }
    
     
}
