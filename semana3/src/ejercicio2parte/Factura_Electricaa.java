
package ejercicio2parte;

public class Factura_Electricaa {
  int NC;
  int LAM;
  int LAnteM;
  int M = 10;
  int CM, CD;
  double VF;
  
  
  public Factura_Electricaa(){
      
      
  }

    public Factura_Electricaa(int NC, int LAM, int LAnteM, int M, int CM, int CD, double VF) {
        this.NC = NC;
        this.LAM = LAM;
        this.LAnteM = LAnteM;
        this.M = M;
        this.CM = CM;
        this.CD = CD;
        this.VF = VF;
    }

    public int getNC() {
        return NC;
    }

    public void setNC(int NC) {
        this.NC = NC;
    }

    public int getLAM() {
        return LAM;
    }

    public void setLAM(int LAM) {
        this.LAM = LAM;
    }

    public int getLAnteM() {
        return LAnteM;
    }

    public void setLAnteM(int LAnteM) {
        this.LAnteM = LAnteM;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }

    public int getCM() {
        return CM;
    }

    public void setCM(int CM) {
        this.CM = CM;
    }

    public int getCD() {
        return CD;
    }

    public void setCD(int CD) {
        this.CD = CD;
    }

    public double getVF() {
        return VF;
    }

    public void setVF(double VF) {
        this.VF = VF;
    }
    
    
    
    public int ConsumoMes(){
       
        int consumo = 0;
        consumo = (this.LAM - this.LAnteM) * this.M;
        
        return consumo;
    }
    
    public int ConsumoDiario(Factura_Electricaa D){
        int CDiario = 0;
        
        CDiario = D.ConsumoMes() / 30;
                
       return CDiario;
    }
    
    public double ValorFactura(Factura_Electricaa d){
        
        this.VF = d.ConsumoMes()* 0.20;
        
        return this.VF;
    }
    
    public void atributos(Factura_Electricaa dato){
        System.out.println("--------------------------------------------------------");
        System.out.println("Su numero de cuenta: " + this.NC);
        System.out.println("--------------------------------------------------------");
        System.out.println("Lectura actual del medidor:" + this.LAM + "kWh");
        System.out.println("--------------------------------------------------------");
        System.out.println("Lectura anterior del medidor" + this.LAnteM + "kWh");
        System.out.println("--------------------------------------------------------");
        System.out.println("Su consumo mensual es: " + dato.ConsumoMes() + "kWh");
        System.out.println("--------------------------------------------------------");
        System.out.println("El consumo diario es: " + dato.ConsumoDiario(dato) + "kWh");
        System.out.println("--------------------------------------------------------");
        System.out.println("El valor de su factura es: $" + dato.ValorFactura(dato));
        System.out.println("--------------------------------------------------------");
    }
    
  
}
