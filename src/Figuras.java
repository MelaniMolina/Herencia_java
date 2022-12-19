public abstract class Figuras {//Clase Padre solo metodos(suma,resta,multiplicacion) o superclase
    int x, y;
    double perimetro;
    double area;
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    protected abstract void Calcular_Perimetro();


    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    protected abstract void Calculo_Area();


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
