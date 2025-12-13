import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class BEE1040 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        df.setRoundingMode(RoundingMode.DOWN);
        Scanner teclado = new Scanner(System.in);
        double N1, N2, N3, N4, Exame, Media;

        N1 = teclado.nextDouble();
        N2 = teclado.nextDouble();
        N3 = teclado.nextDouble();
        N4 = teclado.nextDouble();

        Media = (2 * N1 + 3 * N2 + 4 * N3 + 1 * N4) / 10.0;

        System.out.println("Media: " + df.format(Media));

        if (Media < 5) {
            System.out.println("Aluno reprovado.");
        } else if (Media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno em exame.");

            Exame = teclado.nextDouble();
            System.out.println("Nota do exame: " + df.format(Exame));

            Media = (Media + Exame) / 2.0;

            if (Media < 5) {
                System.out.println("Aluno reprovado.");
            } else {
                System.out.println("Aluno aprovado.");
            }

            System.out.println("Media final: " + df.format(Media));
        }

        teclado.close();
    }
}
