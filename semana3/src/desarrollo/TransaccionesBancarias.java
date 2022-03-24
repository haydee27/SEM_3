
package desarrollo;

import java.util.Scanner;

public class TransaccionesBancarias {
    public static void main(String [] args){
        //crear el objeto propietario
        CuentaBancaria cuenta = new CuentaBancaria();//Crear instancias(objeto) de la clase CuentaBancaria
        Scanner leer = new Scanner(System.in);//objeto leer de la clase Scanner para ingreso de datos desde teclado
        
        String duiCliente, nombreCliente;
        long telefonoCliente;
        double abono, retiro;
        
        System.out.println("Ingrese los datos que se solicitan a continuacion: ");
        System.out.println("Nombre del propietario:"); //asigna valores de los atributos
        nombreCliente = leer.nextLine();
        
        System.out.println("Numero de DUI: ");
        duiCliente = leer.nextLine();
        
        System.out.println("Telefono: ");
        telefonoCliente = leer.nextLong();
        
        Cliente propietario = new Cliente(duiCliente, nombreCliente, telefonoCliente);
        cuenta.propietarioCuenta = propietario;
        
        cuenta.propietarioCuenta = propietario; //asiganamos el objeto propietario al objeto cuenta
  
        System.out.println("Ingresar la cantidad a abonar: $ ");
        cuenta.abonar(abono=leer.nextDouble()); //envio a parametro al metodo abonar de la clase CuentaBancaria
        
        System.out.println("Ingresar cantidad a retirar: $ ");
        cuenta.retirar(retiro=leer.nextDouble());
        
        System.out.println("-------------------");
        System.out.println("Su saldo de la cuenta es: " + cuenta.saldoCuenta);//Obtiene saldo de la cuenta
        //Obtener infomacion del propietario
        System.out.println("Datos del propietario   : \n" + cuenta.datosPropietarioCuenta());
    }
}
