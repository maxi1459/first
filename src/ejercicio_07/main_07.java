/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package ejercicio_07;

import java.util.Scanner;

public class main_07 {

    public static void main(String[] args) {

        //LEER
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // DESARROLLAR CÓDIGO
        Persona persona = new Persona();

        ServicioPersona servicio1 = new ServicioPersona();

        servicio1.crearPersona(persona);

        servicio1.esMayorDeEdad(persona);

        ServicioPersona.mostrar(persona);

        servicio1.mostrarIMC(persona);

        System.out.println("¿ Es mayor de edad ? : " + servicio1.esMayorDeEdad(persona));
        System.out.println(" ----- FIN -----");

        //------------------------------------
        Persona persona2 = new Persona();
        servicio1.crearPersona(persona2);

        servicio1.esMayorDeEdad(persona2);

        ServicioPersona.mostrar(persona2);

        servicio1.mostrarIMC(persona2);

        System.out.println("¿ Es mayor de edad ? : " + servicio1.esMayorDeEdad(persona));
        System.out.println(" ----- FIN -----");

        //------------------------------------
        Persona persona3 = new Persona();

        servicio1.crearPersona(persona3);

        servicio1.esMayorDeEdad(persona3);

        ServicioPersona.mostrar(persona3);

        servicio1.mostrarIMC(persona3);

        System.out.println("¿ Es mayor de edad ? : " + servicio1.esMayorDeEdad(persona));
        System.out.println(" ----- FIN -----");

        //------------------------------------
        Persona persona4 = new Persona();

        servicio1.crearPersona(persona4);

        servicio1.esMayorDeEdad(persona4);

        ServicioPersona.mostrar(persona4);

        servicio1.mostrarIMC(persona4);

        System.out.println("¿ Es mayor de edad ? : " + servicio1.esMayorDeEdad(persona));
        System.out.println(" ----- FIN -----");

        //----------------------------------
        int peso1 = 0, peso2 = 0, peso3 = 0;
        int[] pesos = {servicio1.calcularIMC(persona), servicio1.calcularIMC(persona2), servicio1.calcularIMC(persona3), servicio1.calcularIMC(persona4)};

        for (int i = 0; i < 4; i++) {
            switch (pesos[i]) {
                case -1:
                    peso1++;
                    break;
                case 0:
                    peso2++;
                    break;
                case 1:
                    peso3++;
                    break;
            }
        }

        System.out.println(" El porcentaje de personas con bajo peso: " + ((peso1 * 100) / 4 ) + "%");
        System.out.println(("El porcentaje de personas con peso ideal es: " + ((peso2 * 100) / 4 ) + "%"));
        System.out.println(" El porcentaje de personas con sobrepeso: " + ((peso3 * 100) / 4 )+ "%");

        int mayor = 0, menor = 0;
        boolean[] edades = {servicio1.esMayorDeEdad(persona), servicio1.esMayorDeEdad(persona2), servicio1.esMayorDeEdad(persona3), servicio1.esMayorDeEdad(persona4)};

        for (int i = 0; i < 4; i++) {
            if (edades[i]) {
                mayor++;
            } else {
                menor++;
            }
        }

        System.out.println(" El porcentaje de personas mayor de edad es : " + ((mayor * 100)/4) + "%");
        System.out.println(" El porcentaje de personas menor de edad es : " + ((menor * 100)/4) + "%");
    }

}
