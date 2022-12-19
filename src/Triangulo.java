public class Triangulo extends  DosDimensiones{
          private String estilo;
          Triangulo(){
              super();//Heredo del Padre -->el atributo propio de la clase hijo(estilo)
              estilo="ninguno";
          }

          Triangulo(String s, double b,double h) {
              super(b,h);
              estilo=s;
          }

          Triangulo(double x){
              super(x);
              estilo="Estilo nuevo";
          }

          double areTri(){
              return  getAltura()*getBase()/2;
          }
          void Mostrar_Estilo(){
              System.out.println("El triangulo tiene: "+estilo);
          }


}
