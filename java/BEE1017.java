import java.util.Scanner;

public class BEE1017 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tempo, velocidade;
        int kmLitro = 12;
        double litros;

        // Entrada
        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();

        // Processamento
        litros = ((double) velocidade * tempo) / (kmLitro);

        // Saída
        System.out.printf("%.3f\n", litros);

        teclado.close();
    }
}