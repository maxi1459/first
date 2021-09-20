/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:

• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.

• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:

Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.

• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.

• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.

• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ejercicio_08;

import java.util.Scanner;

public class main_08 {

    public static void main(String[] args) {

        //LEER
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Cadena cadena1 = new Cadena();

        ServicioCadena servicio1 = new ServicioCadena();

        //INGRESAR FRASE
        servicio1.ingreso(cadena1);

        //MOSTRAR VOCALES
        servicio1.mostrarVocales(cadena1);

        //INVERTIR FRASE
        servicio1.invertirFrase(cadena1);

        // CARACTER REPETIDO
        System.out.println(" Ingrese un caractér para saber cuantas veces se repite ");
        String caracter = leer.next();

        servicio1.vecesRepetido(cadena1, caracter);

        //COMPARAR LONGITUDES
        System.out.println(" Ingrese una frase ");
        String newFrase = leer.next();

        servicio1.compararLongitud(cadena1, newFrase);

        // UNIR FRASES
        System.out.println("Ingrese una nueva frase");
        String fraseIngresada = leer.next();

        servicio1.unirFrases(cadena1, fraseIngresada);

        // REEMPLAZAR LAS "A"
        System.out.println(" Ingrese un caracter para reemplazar las letras ´a´ de la frase");
        String sustituir = leer.next();

        servicio1.reemplazar(cadena1, sustituir);

        // CONTIENE
        System.out.println(" Ingresar un caracter para saber si está presente en el texto");
        String caracter3 = leer.next();

        servicio1.contiene(cadena1, caracter3);

    }

}
