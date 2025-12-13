import java.util.Scanner;

/*
Se B > C;
Se D > A;
Se C + D > A + B;
Se C > 0 e D > 0;
Se A % 2 == 0.
*/

public class BEE1035 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        if ((B > C) && (D > A) && (C + D > A + B) && (C > 0 && D > 0) && (A % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        teclado.close();
    }
}