
package ejercicio_04;

import java.util.Scanner;


public class Rectangulo {
// DESARROLLO

    private Integer base;
    
    private Integer altura;

    public Rectangulo() {
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    
    public void ingreso(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" Ingrese la base y la altura del rectángulo");
        setBase(leer.nextInt());   
        setAltura(leer.nextInt());
    }
    
    public int Superficie(){
        return getBase() * getAltura();
    }
    public int Perimetro(){
        return (getBase() + getAltura())*2;
    }
    
    public void Dibujo(){
        for(int i=0;i<getAltura();i++){
           
            for(int j=0;j<getBase();j++){
                if (i==0 || i==getAltura()-1 || j==0 || j==getBase()-1 ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
        
    }

    public void mostrar(){
        System.out.println(" La base es " + getBase());
        System.out.println(" La altura es " + getAltura());
        System.out.println(" La superficie es " + Superficie() );
        System.out.println(" La perímetro es " + Perimetro() );
        System.out.println("  " );
        Dibujo();
    }  
    
}
