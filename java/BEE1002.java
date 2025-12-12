import java.util.Scanner;

public class BEE1002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pi = 3.14159;
        double raio, A;

        // Leitura
        raio = teclado.nextDouble();

        // Processamento
        A = pi * Math.pow(raio, 2);

        // Saída
        System.out.printf("A=%.4f\n", A);

        teclado.close();
    }
}