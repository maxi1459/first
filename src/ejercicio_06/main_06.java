/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
  máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.

• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejercicio_06;

import java.util.Scanner;

public class main_06 {

    public static void main(String[] args) {

        //LEER
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Cafetera cafetera1 = new Cafetera(100, 1);
        ServicioCafetera servicio1 = new ServicioCafetera();

        ServicioCafetera.mostrar(cafetera1);  // USANDO STATIC NO HACE FALTA CREAR UN OBJETO, CON EL NOMBRE DEL SERVICE BASTA.

        //LLENAR CAFETERA
        servicio1.llenarCafetera(cafetera1);
        ServicioCafetera.mostrar(cafetera1);

        // SERVIR TAZA
        System.out.println(" Ingrese el tamaño de la taza");
        int tamañoTaza = leer.nextInt();

        servicio1.servirTaza(tamañoTaza, cafetera1);
        ServicioCafetera.mostrar(cafetera1);

        //  VACIAR CAFETERA
        servicio1.vaciarCafetera(cafetera1);
        ServicioCafetera.mostrar(cafetera1);

        // AGREGAR CAFE
        System.out.println(" Ingrese la cantidad de cafe a agregar.");
        int mascafe = leer.nextInt();

        servicio1.agregarCafe(mascafe, cafetera1);
        
        ServicioCafetera.mostrar(cafetera1);

       
    }

    
    
}

