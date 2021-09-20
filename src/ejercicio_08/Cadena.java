
package ejercicio_08;


public class Cadena {
   // DESARROLLO

    public String frase;
    public Integer longitud;

    public Cadena(String frase, Integer longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }
   
}
