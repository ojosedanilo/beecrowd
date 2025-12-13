import java.util.Scanner;

public class BEE1038 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo, quantidade;
        double total = 0;

        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();

        switch (codigo) {
            case 1:
                total = quantidade * 4;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5;
                break;
            case 4:
                total = quantidade * 2;
                break;
            case 5:
                total = quantidade * 1.50;
                break;
        }

        System.out.printf("Total: R$ %.2f\n", total);

        teclado.close();
    }
}