package ejercicio_08;

import java.util.Scanner;

public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingreso(Cadena cadena1) {

        System.out.println(" Ingrese una frase");
        cadena1.setFrase(leer.next());
        int longitud = cadena1.getFrase().length();
        cadena1.setLongitud(longitud);
    }

    /*   
    • Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
     */
    public void mostrarVocales(Cadena cadena1) {
        int cont = 0;
        for (int i = 0; i <= cadena1.getLongitud() - 1; i++) {
            String letra = cadena1.getFrase().substring(i,i+1);
            System.out.println(letra);
            switch (letra) {
                case "a":
                    cont = cont + 1;
                    break;
                case "e":
                    cont = cont + 1;
                    break;
                case "i":
                    cont = cont + 1;
                    break;
                case "o":
                    cont = cont + 1;
                    break;
                case "u":
                    cont = cont + 1;
                    break;
            }
        }
        System.out.println(" La frase contiene:" + cont + " vocales");
    }

    /*
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    public void invertirFrase(Cadena cadena1) {
        String fraseInvertida = "a";
        for (int i = cadena1.getLongitud() - 1; i >= 0; i--) {
            String letra = cadena1.getFrase().substring(i,i+1);
            fraseInvertida = fraseInvertida + letra;
        }
        System.out.println(" Frase invertida : " + fraseInvertida);
    }

    /*
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:

Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */
    public void vecesRepetido(Cadena cadena1, String caracter) {
        int cont = 0;
        for (int i = 0; i <= cadena1.getLongitud() - 1; i++) {
            String letra = cadena1.getFrase().substring(i,i+1);
            if (caracter.equals(letra)) {
                cont = cont + 1;
            }
        }
        System.out.println(" El caracter >" + caracter + "< se repite " + cont + " veces.");

    }

    /*
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
     */
    public void compararLongitud(Cadena cadena1, String newFrase) {
        int longi = newFrase.length();
        if (longi == cadena1.getLongitud()) {
            System.out.println(" Las frases tienen la misma longitud ");
        } else {
            System.out.println(" Las frases no tienen  la misma longitud");
        }
    }

    /*
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public void unirFrases(Cadena cadena1, String fraseIngresada) {
        String nuevaFrase;
        nuevaFrase = cadena1.getFrase() +" "+ fraseIngresada;
        System.out.println("La nueva frase es: " + nuevaFrase);
    }

    /*
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
     */
    public void reemplazar(Cadena cadena1, String sustituir) {

        cadena1.setFrase(cadena1.getFrase().replace("a", sustituir));
        System.out.println("La frase actualizada es: "+cadena1.getFrase());
    }

    /*
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public void contiene(Cadena cadena1, String caracter3) {
        boolean validar = false;
        for (int i = 0; i <= cadena1.getLongitud() - 1; i++) {
            String letra = cadena1.getFrase().substring(i,i+1);
            if (caracter3.equals(letra)) {
                validar = true;
            }
        }
        System.out.println("¿ La frase contiene el caracter " + caracter3 + " ? " + validar);

    }

}
