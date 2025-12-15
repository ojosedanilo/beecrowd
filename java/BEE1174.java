import java.util.Scanner;

public class BEE1174 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanhoVetor = 100;
        double valores[];
        valores = new double[tamanhoVetor];

        // Entrada
        for (int i = 0; i < valores.length; i++) {
            valores[i] = teclado.nextDouble();
        }

        // Processamento e Saída
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] <= 10.0) {
                System.out.printf("A[%d] = %.1f\n", i, valores[i]);
            }
        }

        teclado.close();
    }
}
