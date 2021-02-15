import java.util.Locale;
import java.util.Scanner;

public class P1011 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);
        double raio = s.nextDouble();
        double resultado = (((4.0 / 3) * 3.14159) * Math.pow(raio, 3));

        System.out.printf("VOLUME = %.3f\n", resultado);

        s.close();

    }
}
