import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double salario, vendas, total;

        // Entrada
        nome = teclado.nextLine();
        salario = teclado.nextDouble();
        vendas = teclado.nextDouble();

        // Processamento
        total = salario + 0.15d * vendas;

        // Saída
        System.out.printf("TOTAL = R$ %.2f\n", total);

        teclado.close();
    }
}