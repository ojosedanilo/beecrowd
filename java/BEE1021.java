import java.util.Scanner;

public class BEE1021 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n100, n50, n20, n10, n5, n2;
        int m100, m050, m025, m010, m005, m001;
        int restoNotas, restoMoedas;

        // Entrada
        // Usa o "." como separador e lê o valor antes dele
        teclado.useDelimiter("\\.");
        restoNotas = Integer.parseInt(teclado.next());
        // Usa a quebra de linha como separador e lê o valor antes dela, pulando o "."
        teclado.useDelimiter("\n");
        teclado.skip(".");
        restoMoedas = Integer.parseInt(teclado.next());

        // Processamento
        // Notas de 100 reais
        n100 = restoNotas / 100;
        restoNotas = restoNotas % 100;
        // Notas de 50 reais
        n50 = restoNotas / 50;
        restoNotas = restoNotas % 50;
        // Notas de 20 reais
        n20 = restoNotas / 20;
        restoNotas = restoNotas % 20;
        // Notas de 10 reais
        n10 = restoNotas / 10;
        restoNotas = restoNotas % 10;
        // Notas de 5 reais
        n5 = restoNotas / 5;
        restoNotas = restoNotas % 5;
        // Notas de 2 reais
        n2 = restoNotas / 2;
        // Moedas de 1 real
        m100 = restoNotas % 2;

        // Moedas de 50 centavos
        m050 = restoMoedas / 50;
        restoMoedas = restoMoedas % 50;
        // Moedas de 25 centavos
        m025 = restoMoedas / 25;
        restoMoedas = restoMoedas % 25;
        // Moedas de 10 centavos
        m010 = restoMoedas / 10;
        restoMoedas = restoMoedas % 10;
        // Moedas de 5 centavos
        m005 = restoMoedas / 5;
        // Moedas de 1 centavo
        m001 = restoMoedas % 5;

        // Saída
        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(m100 + " moeda(s) de R$ 1.00");
        System.out.println(m050 + " moeda(s) de R$ 0.50");
        System.out.println(m025 + " moeda(s) de R$ 0.25");
        System.out.println(m010 + " moeda(s) de R$ 0.10");
        System.out.println(m005 + " moeda(s) de R$ 0.05");
        System.out.println(m001 + " moeda(s) de R$ 0.01");

        teclado.close();
    }
}