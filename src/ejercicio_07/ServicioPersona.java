package ejercicio_07;

import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /* • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje. 
     */
    public void crearPersona(Persona persona) {
        System.out.println(" Ingrese el nombre de la persona ");
        persona.setNombre(leer.next());
        System.out.println(" Ingrese la edad ");
        persona.setEdad(leer.nextInt());
        System.out.println(" Ingrese el sexo H(hombre), M(mujer) o O(otro) ");
        String nombree = leer.next();
        if (nombree.equals("h") || nombree.equals("m") || nombree.equals("o")) {
            persona.setSexo(nombree);
        } else {
            System.out.println(" El sexo ingresado no es válido");
        }
        System.out.println(" Ingrese el peso ");
        persona.setPeso(leer.nextDouble());
        System.out.println(" Ingrese la altura ");
        persona.setAltura(leer.nextDouble());
    }

    /*• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
     */
    public int calcularIMC(Persona persona) {
        double imc = persona.peso / (persona.altura * persona.altura);
        if (imc < 20) {
            return -1;
        } else {
            if (imc >= 20 && imc <= 25) {
                return 0;
            } else {
                return 1;
            }
        }
    }
    
     public  void mostrarIMC(Persona persona){
        switch (calcularIMC(persona)){
            case -1: 
                System.out.println(" La persona se encuentra debajo de su peso ideal");
                break;
            case  0: 
                System.out.println(" La persona se encuentra em su peso ideal ");
                break;
            case  1: 
                System.out.println(" La persona tiene sobrepeso");
                break;
        }
    }
    
    
    
    /* • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano
     */
    public boolean esMayorDeEdad(Persona persona) {  
        boolean edadd;
        if (18 <= persona.edad) {
           edadd=true;
        } else {
            edadd=false;
        }
        return edadd;
    }

    /*
    public boolean esMayorDeEdad(Persona persona1){   //OTRA MANERA DE ESCRIBIRLO
        
        return   18<=persona1.edad;
    }
    
     */
    public static void mostrar(Persona persona) {
        System.out.println(" ----- Datos Ingresados -----");
        System.out.println(" NOMBRE: " + persona.nombre);
        System.out.println(" EDAD: " + persona.edad);
        System.out.println(" SEXO: " + persona.sexo);
        System.out.println(" PESO: " + persona.peso);
        System.out.println(" ALTURA: " + persona.altura);
        System.out.print(" Según IMC: ");
        
    }

}
