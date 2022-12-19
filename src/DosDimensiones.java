public class DosDimensiones {//Clase Abuelo

    private double base;

    private double altura;

    DosDimensiones(){
        base = altura=0.0;
    }
    DosDimensiones(double b,double h){
    base= b;
    altura=h;
}

    DosDimensiones(double x){
        base = altura = x;

}
    double getBase(){
        return  base;
    }
    double getAltura(){
        return altura;
    }
    void setBase(double b){
        base=b;
    }
    void setAltura(double h){
        altura=h;
    }


    void mostrar_Dimension(){
        System.out.println("La Base:  "+base+" y "+"la altura es:  "+altura);
    }
}
