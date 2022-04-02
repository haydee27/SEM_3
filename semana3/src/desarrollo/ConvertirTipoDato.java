
package desarrollo;

public class ConvertirTipoDato {
  public static void main (String [] args){
      ConvertirTipoDato polimorfismo = new ConvertirTipoDato();
      
      System.out.println("Valor int a String: " + polimorfismo.convertirAString(10));
      System.out.println("Valor double a string: "+ polimorfismo.convertirAString(10.0));
      System.out.println("Vlor float a string: " + polimorfismo.convertirAString(10.12));
  } 
  
  public String covertirAString(int valorint){
      String conversion = String.valueOf(valorint);
      return conversion;
      
  }
  
  public String convertirAString (double valordouble){
      String conversion = String.valueOf(valordouble);
      return conversion;
      
  }
  
  public String convertirAString (float valorfloat){
      String conversion = String.valueOf(valorfloat);
      return conversion;
  }
}
