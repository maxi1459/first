/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
*/


package ejercicio_10;

import java.util.Scanner;


public class main_10 {

   
    public static void main(String[] args) {
       
        //LEER
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Arreglo objeto1=new Arreglo();

      //LLENAR ARREGLO A Y MOSTRARLO
      Arreglo.llenarArreglo(objeto1);
      Arreglo.mostrarArregloA(objeto1);
      //ORDENAR ARREGLO A 
      Arreglo.ordenarArreglo(objeto1);
      // COPIAR LOS PRIMEROS NÚMEROS DE "A" Y PASARLOS A "B".
      Arreglo.LLenarArregloB(objeto1);
      // MOSTRAR LOS ARREGLOS FINALES
      Arreglo.mostrarArregloA(objeto1);
      Arreglo.mostrarArregloB(objeto1);
         
    } 
    
}
