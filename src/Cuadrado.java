public class Cuadrado extends Figuras{
   private double lado;


    public Cuadrado(double lado) {
        this.lado = lado;
        Calculo_Area();
        Calcular_Perimetro();
    }

    @Override//Sobre escribir al metodo que se tenia
   protected void Calculo_Area(){
       area=lado*lado;
   }
    @Override
    protected void Calcular_Perimetro(){//Elementos protejidos
       perimetro = lado*4;
    }

}
