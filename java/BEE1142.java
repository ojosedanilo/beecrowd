import java.util.Scanner;

public class BEE1142 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int linhas;
        int num = 1;

        linhas = teclado.nextInt();

        for (int i = 1; i <= linhas; i++) {
            System.out.println(num + " " + (num + 1) + " " + (num + 2) + " PUM");
            num += 4;
        }

        teclado.close();
    }
}