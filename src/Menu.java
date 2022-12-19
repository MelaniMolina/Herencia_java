public class Menu {
    public static void main(String[] args){
        Rectangulo miRectangulo = new Rectangulo();//Creamos la instancia
        miRectangulo.setX(20);
        miRectangulo.setY(10);
        miRectangulo.Calcular_Perimetro();
        System.out.println(miRectangulo.getPerimetro());
        miRectangulo.Calculo_Area();
        System.out.println(miRectangulo.getArea());
        Cuadrado miCuadrado= new Cuadrado();
        miCuadrado.setX(4);
        miCuadrado.setY(4);
        miCuadrado.Calcular_Perimetro();
        System.out.println(miCuadrado.getPerimetro());
        miCuadrado.Calculo_Area();
        System.out.println(miCuadrado.getArea());
        ColorTriangulo t1 = new ColorTriangulo("Azul","Estilo x",8.0,12.0);
        ColorTriangulo t2 = new ColorTriangulo("Rojo","Estilo y",4.0,3.0);
        System.out.println("Datos del Triangulo 1");
        t1.Mostrar_Estilo();
        t1.Mostrar_Color();
        t1.mostrar_Dimension();
        System.out.println("Su Area es: "+t1.areTri());
        System.out.println("Datos del Triangulo 2");
        t2.Mostrar_Estilo();
        t2.Mostrar_Color();
        t2.mostrar_Dimension();
        System.out.println("Su Area es: "+t2.areTri());
    }
}
