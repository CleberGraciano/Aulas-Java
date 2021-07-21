package exercicioL4;

public class TestaFiguraGeometrica {
    public static void main(String[] args) {
        Quadrado objetoQuadrado = new Quadrado();
        objetoQuadrado.base=2;
        objetoQuadrado.altura=2;
        System.out.println("A area do quadrado é: "+objetoQuadrado.calcularArea());

        Retangulo objetoRetangulo = new Retangulo();
        objetoRetangulo.base=3;
        objetoRetangulo.altura=2;
        System.out.println("A area do retangulo é: "+objetoRetangulo.calcularArea());


    }
}
