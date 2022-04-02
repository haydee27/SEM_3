
package desarrollo;

public class cuentaBancaria1 extends ClienteBanco {
   private long numCuenta;
   private double CargoCuenta;
   private double abonoCuenta;
   private double saldoCuenta;
   private double estadoCuenta;

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getCargoCuenta() {
        return CargoCuenta;
    }

    public void setCargoCuenta(double CargoCuenta) {
        this.CargoCuenta = CargoCuenta;
    }

    public double getAbonoCuenta() {
        return abonoCuenta;
    }

    public void setAbonoCuenta(double abonoCuenta) {
        this.abonoCuenta = abonoCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = this.abonoCuenta - this.CargoCuenta;
    }

    public double getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(double estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }
   
   
}
