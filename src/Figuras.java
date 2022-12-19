public class Figuras {//Clase Padre solo metodos(suma,resta,multiplicacion) o superclase
    int x, y;
    double perimetro;
    double area;
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public void Calcular_Perimetro(){
        perimetro = 2*x+2*y;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public void Calculo_Area(){
        area = x*y;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
