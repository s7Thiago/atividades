import java.util.Scanner;

class Hora {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double hora = s.nextDouble();

        if (hora < 12) {

            System.out.println("Bom dia");

        }

        if (hora >= 12 && hora <= 18) {

            System.out.println("Boa tarde");

        }

        if (hora > 18 && hora <= 23) {

            System.out.println("Boa noite");
        }

        s.close();

    }
}