package ejercicio_09;

public class servicioMatematica {

    // DESARROLLO
    /*
    • Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
     */
    public double devolverMayor(Matematica objeto) {

        return Math.max(objeto.getNumero1(), objeto.getNumero2());

    }

    /*
    • Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
     */
    public void calcularPotencia(Matematica objeto, double menor, double mayor) {

        menor = Math.min(objeto.getNumero1(), objeto.getNumero2());
        menor = Math.round(menor);
        mayor = Math.round(mayor);
        double potencia = Math.pow(mayor, menor);

        System.out.println("el cálculo de potencia es igual a: " + potencia);
    }

    /*
    • Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     */
    public void calcularRaiz(Matematica objeto) {

        double menor = Math.abs(Math.min(objeto.getNumero1(), objeto.getNumero2()));
        double raiz = Math.sqrt(menor);
        System.out.println("el cálculo de la raíz es igual a: " + raiz);
    }

}
