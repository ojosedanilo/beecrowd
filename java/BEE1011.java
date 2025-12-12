import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pi = 3.14159;
        double r, volume;

        // Entrada
        r = teclado.nextDouble();

        // Processamento
        volume = (4 / 3.0) * pi * Math.pow(r, 3);

        // Saída
        System.out.printf("VOLUME = %.3f\n", volume);

        teclado.close();
    }
}