package exercicioL4;

public class Circulo implements FiguraGeometrica{

    double raio;

    @Override
    public double calcularArea() {
        return Math.pow((Math.PI*this.raio),2);
    }
}
