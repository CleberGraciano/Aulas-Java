package exercicioL4;


public class Quadrado implements FiguraGeometrica {

    double altura;
    double base;

    @Override
    public double calcularArea() {

        return this.altura*this.base;
    }


}
