import java.util.Scanner;

public class BEE1014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int distancia;
        double combustivel, kmLitro;

        // Entrada
        distancia = teclado.nextInt();
        combustivel = teclado.nextDouble();

        // Processamento
        kmLitro = distancia / combustivel;

        // Saída
        System.out.printf("%.3f km/l\n", kmLitro);

        teclado.close();
    }
}