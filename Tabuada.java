import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();

        for (int i = 0; i <= 1000; i++) {
            System.out.println(i + " * " + numero + " = " + (numero * i));
        }

        s.close();

    }
}
