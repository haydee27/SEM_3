
package desarrollo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TransaccionesBancarias1 {
    public static void main(String [] args){
        cuentaBancaria1 cuenta = new cuentaBancaria1();
        BufferedReader leer = new BufferedReader( new InputStreamReader(System.in));
        
        double abonoCuenta, cargoCuenta;
        try{
            //INGRESO DE LOS RESPECTIVOS VALORS A LOS ATRIBUTOS HEREDADOS
            System.out.println("DUI del cliente:");
            long numDui = Long.parseLong(leer.readLine());
            System.out.println("Nombre del cliente: ");
            String nombres = leer.readLine();
            System.out.println("El telefono del ciente: ");
            String telefono = leer.readLine();
            
            //Ingresar Valores de prueba
            System.out.println("Ingresar el abono a la cuenta");
            abonoCuenta = Double.parseDouble(leer.readLine());
            System.out.println("Ingresar el cargo a la cuenta: ");
            cargoCuenta = Double.parseDouble(leer.readLine());
            
            //ASIGNAR VALORES DE LOS METODOS ATRIBUTOS HEREDADOS
            cuenta.setNumDui(numDui);
            cuenta.setNomCliente(nombres);
            cuenta.setTelCliente(telefono);
            
            //ASIGNAR LOS VALORES METODO SET
            
            cuenta.setAbonoCuenta(abonoCuenta);
            cuenta.setCargoCuenta(cargoCuenta);
            cuenta.setSaldoCuenta(cargoCuenta);
            
            //RETORNAR VALORES DEL METODO GET DE LA CLASE HEREDADA
            System.out.println("Numero de Dui: " + cuenta.getNumDui());
            System.out.println("Nombre de cliente: "+ cuenta.getNomCliente());
            System.out.println("Numero de telefono del cliente" + cuenta.getTelCliente());
            
            //RETORNAR VALORES DE METODOS
            System.out.println("Abono: " + cuenta.getAbonoCuenta());
            System.out.println("Cargo: " + cuenta.getCargoCuenta());
            System.out.println("Saldo: " + cuenta.getSaldoCuenta());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
