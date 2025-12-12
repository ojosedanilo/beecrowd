import java.util.Scanner;

public class BEE1012 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pi = 3.14159;
        double a, b, c;
        double areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        // Entrada
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        // Processamento
        // a) a área do triângulo retângulo que tem A por base e C por altura.
        areaTrianguloRetangulo = a * c / 2;
        // b) a área do círculo de raio C. (pi = 3.14159)
        areaCirculo = pi * Math.pow(c, 2);
        // c) a área do trapézio que tem A e B por bases e C por altura.
        areaTrapezio = (a + b) * c / 2;
        // d) a área do quadrado que tem lado B.
        areaQuadrado = Math.pow(b, 2);
        // e) a área do retângulo que tem lados A e B.
        areaRetangulo = a * b;

        // Saída
        System.out.printf("TRIANGULO: %.3f\n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        teclado.close();
    }
}