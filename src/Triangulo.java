public class Triangulo extends Figuras{
        private double base;
        private double altura;

        public Triangulo(double base,double altura){
            this.base=base;
            this.altura=altura;
            Calculo_Area();
            Calcular_Perimetro();
        }

        public void  Calculo_Area(){
            area=base*altura/2;
        }
        public void Calcular_Perimetro(){
            perimetro = base*3;

        }

}
