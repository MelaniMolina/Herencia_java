import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        System.out.println("-<-<-<-<- M E N U -<-<-<-<-");
        System.out.println("1) Cuadrado");
        System.out.println("2) Rectangulo");
        System.out.println("3) Triangulo");
        System.out.println("Seleccione la Opcion que Desee");
        System.out.print(">> ");
        op=sc.nextInt();
        switch (op){
            case 1:
                System.out.println("Ha Selecionado la Opcion 1");
                System.out.print("Ingrese el valor del Lado del cuadrado: ");
                double longitudlado= sc.nextDouble();
                Cuadrado miCuadrado= new Cuadrado(longitudlado);
                System.out.println(miCuadrado.getArea());
                System.out.println(miCuadrado.getPerimetro());
                break;
            case 2:
                System.out.println("Ha Selecionado la Opcion 2");
                System.out.print("Ingrese la base rectangular: ");
                double longitudbase= sc.nextDouble();
                System.out.println("Ingrese la altura rectangular: ");
                double longitudaltura= sc.nextDouble();
                Rectangulo miRectangulo =new Rectangulo(longitudbase,longitudaltura);
                System.out.println(miRectangulo.getArea());
                System.out.println(miRectangulo.getPerimetro());
                break;
            case 3:
                System.out.println("Ha Seleccionado la Opcion 2");
                System.out.print("Ingrese la base Triangulo: ");
                double base = sc.nextDouble();
                System.out.println("Ingrese la altura Triangulo: ");
                double altura = sc.nextDouble();
                Triangulo miTriangulo  = new Triangulo (base,altura);
                System.out.println(miTriangulo.getArea());
                System.out.println(miTriangulo.getPerimetro());
                break;


            default:

        }







        /*Rectangulo miRectangulo = new Rectangulo();//Creamos la instancia
        miRectangulo.setX(20);
        miRectangulo.setY(10);
        miRectangulo.Calcular_Perimetro();
        System.out.println(miRectangulo.getPerimetro());
        miRectangulo.Calculo_Area();
        System.out.println(miRectangulo.getArea());
        Cuadrado miCuadrado= new Cuadrado();
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
        System.out.println("Su Area es: "+t2.areTri());*/
    }
}
