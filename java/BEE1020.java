import java.util.Scanner;

public class BEE1020 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, dias, meses, anos;

        // Entrada
        n = teclado.nextInt();

        // Processamento
        anos = n / 365;
        n = n % 365;

        meses = n / 30;
        dias = n % 30;

        // Saída
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        teclado.close();
    }
}