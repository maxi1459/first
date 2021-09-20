package ejercicio_05;

import java.util.Scanner;

public class Cuenta {
// DESARROLLO

    public int numeroCuenta;
    public Integer DNI;
    public Double salario;
    public Double interes;

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta(int numeroCuenta, Integer DNI, double salario, Double interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.salario = salario;
    }

    public Cuenta() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public void crearCuenta() {

        System.out.println(" Ingrese su número de cuenta, dni, salario e interés");
        setNumeroCuenta(leer.nextInt());
        setDNI(leer.nextInt());
        setSalario(leer.nextDouble());
        setInteres(leer.nextDouble());

    }

    public void ingreso() {
        System.out.println("Ingrese su dinero");
        setSalario(getSalario() + leer.nextDouble());
        System.out.println(" Su dinero disponible es: $" + getSalario());
    }

    public void retiro() {
        System.out.println("Ingrese el monto a retirar, el máximo es: $" + getSalario());
        double retirotot = leer.nextDouble();
        if (retirotot > getSalario()) {
            System.out.println(" El monto ingresado es mayor al que posee en su cuenta, su saldo ahora es CERO.");
            setSalario(0);
        } else {
            setSalario(getSalario() - retirotot);

            System.out.println(" Su dinero disponible es: $" + getSalario());
        }
    }

    public void extraccionRapida() {
        System.out.println(" Ha elegido extracción rápida.");
        System.out.println(" Ingrese el monto a retirar, recuerde que no puede superar el %20 del total.");
        double control = leer.nextDouble();
        if (control > getSalario() * 0.20) {
            System.out.println("No se puede extraer la cantidad de dinero solicitada");
        } else {
            Cuenta extraccion = new Cuenta();
            extraccion.retiro();
        }

    }
    
    public void consultarSaldo(){
        System.out.println(" El saldo actual es: $"+ getSalario());
    }
    
     public void consultarDatos(){
        System.out.println(" Los datos son: ");
        System.out.println(" Número de cuenta: "+getNumeroCuenta());
        System.out.println(" El DNI : "+getDNI());
        
    }
    
    
    
    
    

}
