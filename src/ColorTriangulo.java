public class ColorTriangulo extends Triangulo{
    private String color;
    ColorTriangulo(String c,String s,double b,double h){
        super(b,h);
        color=c;
    }
    String getColor(){
        return color;
    }
    void Mostrar_Color(){
        System.out.println("El color es: "+color);
    }
}
