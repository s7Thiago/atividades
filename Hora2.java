import java.lang.reflect.Array;
import java.util.Scanner;

public class Hora2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] hora = new int[2];

        // Lendo a hora
        hora[0] = s.nextInt();

        System.out.print(hora[0] + ":");

        // Lendo os minutos
        hora[1] = s.nextInt();

        System.out.println("\n\nVocê digitou " + hora[0] + ":" + hora[1] + "\n\n");

        s.close();

    }
}
