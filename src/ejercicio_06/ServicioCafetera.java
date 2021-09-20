
package ejercicio_06;


public class ServicioCafetera {
  

    public ServicioCafetera() {
    }
    
    public void llenarCafetera(Cafetera cafetera2){
        cafetera2.setCantidadActual(cafetera2.getCapacidadMaxima());
    }
    
   public void servirTaza(int tamañoTaza, Cafetera cafetera2 ){
      if (tamañoTaza>cafetera2.getCantidadActual()){
          System.out.println(" No Alcanza, se servirá el café restante");
          System.out.println(" La taza se sirvió con: " +(cafetera2.getCantidadActual())+" mls.");
          cafetera2.setCantidadActual(0);
      }else{
          System.out.println(" La taza se llenó");
          cafetera2.setCantidadActual(cafetera2.getCantidadActual()-tamañoTaza);
      }
       
   } 
   
   public void vaciarCafetera(Cafetera cafetera2){
       cafetera2.setCantidadActual(0);
       System.out.println(" Se vació la cafetera ");
   }
   
   public void  agregarCafe(int mascafe, Cafetera cafetera2){
       cafetera2.setCantidadActual(mascafe+cafetera2.getCantidadActual());
       System.out.println(" Se llenó la cafetera ");
       
   }
   
   public static void mostrar(Cafetera cafetera2){
       System.out.println(cafetera2.getCantidadActual());
       System.out.println(cafetera2.getCapacidadMaxima());
       System.out.println("-----------------");
   }
    
}
