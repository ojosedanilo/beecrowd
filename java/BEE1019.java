import java.util.Scanner;

public class BEE1019 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N, horas, minutos, segundos, resto;

        // Entrada
        N = teclado.nextInt();

        horas = 0;
        minutos = 0;

        // Processamento
        horas = N / 3600;
        resto = N % 3600;

        minutos = resto / 60;
        segundos = resto % 60;

        // Saída

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

        teclado.close();
    }
}