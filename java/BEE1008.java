import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, horas;
        double valorPorHora, salario;

        // Entrada
        numero = teclado.nextInt();
        horas = teclado.nextInt();
        valorPorHora = teclado.nextDouble();

        // Processamento
        salario = horas * valorPorHora;

        // Saída
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        teclado.close();
    }
}