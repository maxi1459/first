
package ejercicio_02;

import java.util.Scanner;


public class Circunferencia {
// DESARROLLO

    private Double Radio;

    public Double getRadio() {
        return Radio;
    }

    public void setRadio(Double Radio) {
        this.Radio = Radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "Radio=" + Radio + '}';
    }

    public Circunferencia(Double Radio) {//CONSTRUCTOR QUE INICIALIZA EL ATRIBUTO
        this.Radio = Radio;
    }

    public Circunferencia crearcircunferencia() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el radio");
        Circunferencia nuevacircunferencia=new Circunferencia(leer.nextDouble());
        
        return nuevacircunferencia;
    }
    public Double Area(){
        Double area;
        area=Math.PI*(Radio*Radio);
                
        return area;
    }
    public Double Perimetro(){
        Double perimetro;
        perimetro=2*Math.PI*Radio;
                
        return perimetro;
    }
   
}
