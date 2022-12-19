public class Rectangulo extends Figuras {
   private double base;
    private double altura;
    public Rectangulo (double base,double altura){
        this.base=base;
        this.altura=altura;
        Calculo_Area();
        Calcular_Perimetro();
    }
    protected void Calculo_Area(){
        area=base*altura;
    }
    protected void Calcular_Perimetro(){
        perimetro=base*2+altura*2;
    }
}
