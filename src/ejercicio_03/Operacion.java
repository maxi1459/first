package ejercicio_03;

import java.util.Scanner;

public class Operacion {

    private Integer numero1;

    private Integer numero2;

    public Operacion(Integer numero1, Integer numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {

    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }
    
    // PREGUNTAR USAR SET O OP1

    public Operacion crearOperacion() {    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos números");
        this.numero1 = leer.nextInt();
        this.numero2 = leer.nextInt();
        Operacion op1 = new Operacion(numero1, numero2);
        return op1;
    }
    
    //OTRA OPCION
    
    /*
    public void crearOp(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los nros");
        setNro1(leer.nextDouble());
        setNro2(leer.nextDouble());        
    }
*/

    public int Suma() {

        return getNumero1() + getNumero2();
    }

    public int Resta() {

        return getNumero1() - getNumero2();
    }
    
    public int Mult(){
        if(this.numero1==0 || this.numero2==0 ){
            System.out.println(" Uno de los valores ingresador es cero");
            return 0;
        }else{
            return getNumero1() * getNumero2();
        }
       
    }
    
    public double Dividir(){
       if(this.numero1==0 || this.numero2==0 ){
            System.out.println(" Uno de los valores ingresador es cero");
            return 0;
        }else{
            return (getNumero1()/getNumero2());
        }  
    }
/*
    @Override                                            // MOSTRAR EN LA CLASS
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    */
    
}
