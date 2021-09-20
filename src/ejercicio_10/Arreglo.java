
package ejercicio_10;

import java.util.Arrays;


public class Arreglo {
   // DESARROLLO
    
    public double arreglo1[]=new double[50];
        
    public double arreglo2[]=new double[20];

    public Arreglo() {
    }

    public double[] getArreglo1() {
        return arreglo1;
    }

    public void setArreglo1(double[] arreglo1) {
        this.arreglo1 = arreglo1;
    }

    public double[] getArreglo2() {
        return arreglo2;
    }

    public void setArreglo2(double[] arreglo2) {
        this.arreglo2 = arreglo2;
    }
    
    
    public static void llenarArreglo(Arreglo objeto1){
         for (int i = 0; i < 50; i++) {
           
            objeto1.arreglo1[i]=Math.round(Math.random()*100);
            
        }
    }
    

    public static void mostrarArregloA(Arreglo objeto1){
        System.out.println(" ----- Arrelgo 1 -----");
        
        for (int i = 0; i < objeto1.arreglo1.length ; i++) {
            System.out.print("["+objeto1.arreglo1[i]+"]");
        }
        System.out.println("");
    }
    
    public static void mostrarArregloB(Arreglo objeto1){
        System.out.println(" ----- Arrelgo 2 -----");
        
        for (int i = 0; i < objeto1.arreglo2.length ; i++) {
            System.out.print("["+objeto1.arreglo2[i]+"]");
        }
        System.out.println("");
    }
    
    
    public static void ordenarArreglo(Arreglo objeto1){
        Arrays.sort(objeto1.arreglo1);
        
        System.out.println(" ----- Arrelgo 1 ORDENADO -----");
        
    }
    
    public static void LLenarArregloB(Arreglo objeto1){
    
       objeto1.arreglo2= Arrays.copyOf(objeto1.arreglo1, 20);
       
       Arrays.fill(objeto1.arreglo2, 10, 20, 0.5); 
    }
    
    
}
