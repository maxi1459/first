/*
Crear una clase llamada Operacion que tenga como atributos privados el numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.

*/


package ejercicio_03;



public class main_3 {

   
    public static void main(String[] args) {
        
    Operacion inicio = new Operacion();
    inicio=inicio.crearOperacion();   //creo el objeto INICIO y le asigno el objeto crearoperacion, obtenidos en la clase
    
    
        System.out.println("La suma de " + inicio.getNumero1() +" + "+ inicio.getNumero2() + " es " + inicio.Suma());
         System.out.println("La resta de " + inicio.getNumero1() +" - "+ inicio.getNumero2() + " es " + inicio.Resta());
          System.out.println("La suma de " + inicio.getNumero1() +" * "+ inicio.getNumero2() + " es " + inicio.Mult());
           System.out.println("La suma de " + inicio.getNumero1() +" / "+ inicio.getNumero2() + " es " + inicio.Dividir());
           
           // La division da 0.0 porque hay que poner todas variables DOUBLE !!!
        
    } 
    
}
