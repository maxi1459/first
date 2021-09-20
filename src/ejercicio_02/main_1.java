package ejercicio_02;

public class main_1 {

    public static void main(String[] args) {
        // DESARROLLAR CÓDIGO

        Circunferencia circunferencia1 = new Circunferencia(10.0);
        System.out.println(circunferencia1.Area());
        System.out.println(circunferencia1.Perimetro());
        
        Circunferencia modCircun = new Circunferencia(1.0);
        modCircun=modCircun.crearcircunferencia();
        System.out.println(modCircun);
        System.out.println(modCircun.Area());
        System.out.println(modCircun.Perimetro());
        
    }
}
