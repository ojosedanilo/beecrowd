import java.util.Scanner;

public class BEE1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n = 0, soma = 0;
        int numPos = 0;

        for (int i = 1; i <= 6; i++) {
            n = teclado.nextDouble();
            if (n > 0) {
                numPos++;
                soma += n;
            }
        }

        System.out.println(numPos + " valores positivos");
        System.out.printf("%.1f\n", soma / numPos);

        teclado.close();
    }
}
