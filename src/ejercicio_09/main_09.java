/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
20
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio_09;

import java.util.Scanner;

public class main_09 {

    public static void main(String[] args) {

        //LEER
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // DESARROLLAR CÓDIGO
        Matematica objeto = new Matematica();
        servicioMatematica servicio = new servicioMatematica();

        double menor = 0, mayor = 0;

        objeto.setNumero1(Math.random() * 100);
        objeto.setNumero2(Math.random() * 100);

        System.out.println("el número 1 es " + objeto.getNumero1());
        System.out.println("el número 2 es " + objeto.getNumero2());

        mayor = servicio.devolverMayor(objeto);
        
        servicio.calcularPotencia(objeto, menor, mayor);

        servicio.calcularRaiz(objeto);

    }

}
