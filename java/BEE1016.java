import java.util.Scanner;

public class BEE1016 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int velX = 60;
        int velY = 90;
        int distancia, tempo;

        // Entrada
        distancia = teclado.nextInt();

        // Processamento
        tempo = distancia * 60 / (velY - velX);

        // Saída
        System.out.println(tempo + " minutos");

        teclado.close();
    }
}