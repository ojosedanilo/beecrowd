import java.util.Scanner;

public class BEE1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorAPagar;
        // código de uma peça 1, número de peças 1, valor unitário de cada peça 1
        int cod1, num1;
        double val1;
        // código de uma peça 2, número de peças 2, valor unitário de cada peça 2
        int cod2, num2;
        double val2;

        // Entrada
        cod1 = teclado.nextInt();
        num1 = teclado.nextInt();
        val1 = teclado.nextDouble();
        cod2 = teclado.nextInt();
        num2 = teclado.nextInt();
        val2 = teclado.nextDouble();

        // Processamento
        valorAPagar = num1 * val1 + num2 * val2;

        // Saída
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorAPagar);

        teclado.close();
    }
}